package teoria.excepecionesNoTratadas;

import java.util.Arrays;
import java.util.Random;

public class Ejemplo3 {
    public static void main(String[] args) {
        Random random = new Random();
        int tamanno = random.nextInt(50);
        int[] coleccion = new int[tamanno];
       /* for (int i = 0; i < 10; i++) {
            coleccion[i] = random.nextInt();
        }*/  //puede generar una excepción, pasar el tamaño de la misma
        for (int i = 0; i < coleccion.length; i++) {
            coleccion[i] = random.nextInt();
        }
        System.out.printf("Tamaño de la colección: %d%n", coleccion.length);
        System.out.println(Arrays.toString(coleccion));
        //mostrando la posición 10 sí ó si
        int posición = 10;
        if (posición > coleccion.length)
            System.out.println("No existe ese elemento");
        else
            System.out.printf("Posición %d: %d%n", posición, coleccion[posición - 1]);
    }

}
