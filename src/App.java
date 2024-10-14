import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in);
        MetodosBusqueda mB = new MetodosBusqueda();
        
        int [] arreglo = new int[100000];

        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = i;
        }


        //int posicion = mB.busquedaSecuencial(arreglo, 30);
        //System.out.println(" ");
        //if (posicion != -1){
          //  System.out.println("El valor se encuentra en la posicion: " + posicion);
        //} else {
          //  System.out.println("Valor no encontrado :/");
        //}

        //int resultado = mB.busquedaBin(arreglo, 90);

        //if (resultado != -1){
          //  System.out.println("El valor se encuentra en la posicion: " + resultado);
        //} else {
          //  System.out.println("Valor no encontrado :/");
        //}


        long startTimeSecuencial = System.nanoTime();
        long finishTiemSecuencial = System.nanoTime();
        int resultado = mB.busquedaSecuencial(arreglo, 50418);

        if (resultado != -1){
            System.out.println("El valor se encuentra en la posicion: " + resultado);
        } else {
            System.out.println("Valor no encontrado :/");
        }
        System.out.println("Tiempo de ejecucion en nanosegundos es: " + (finishTiemSecuencial - startTimeSecuencial));
        
        System.out.println(" ");

        
        long startTimeBinaria = System.nanoTime();
        int resultadoBinaria = mB.busquedaBin(arreglo, 50418);
        long finishTiemBinaria = System.nanoTime();

        if (resultadoBinaria != -1){
          System.out.println("El valor se encuentra en la posicion: " + resultadoBinaria);
      } else {
          System.out.println("Valor no encontrado :/");
      }
        System.out.println("Tiempo de ejecucion en nanosegundos es: " + (finishTiemBinaria - startTimeBinaria));
    }
}
