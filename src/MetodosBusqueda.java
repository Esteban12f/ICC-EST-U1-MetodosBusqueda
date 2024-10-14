public class MetodosBusqueda {
    
    public int busquedaSecuencial(int[] arreglo, int valorBuscar){
        int comparaciones = 0;
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] == valorBuscar){
                comparaciones = i + 1;
                System.out.println("El numero de comparaciones es: " + comparaciones);
                return i;
            }
        }
        return -1;
    }

    public int busquedaBin(int[] arreglo, int valorBuscar){
        int inicio = 0;
        int fin = arreglo.length - 1;
        int comparaciones = 0;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            comparaciones ++;
            if (arreglo[medio] == valorBuscar){
                // Elemento encontrado
                System.out.println("El numero de comparaciones es: " + comparaciones);
                return medio;
            }
            
            if (arreglo[medio] < valorBuscar){
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1;

    }
    
    
    public void printArreglo(int[] arreglo){
        for (int elem : arreglo){
            System.out.print(elem + " ");
        }
    }

}
