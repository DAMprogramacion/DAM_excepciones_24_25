package teoria.excepecionesTratadas.ejemplo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio4 {
    private static File file = new File("ficheros/dos.txt");
    public static void main(String[] args) {
        int numeroPares = 0;
        try {
            numeroPares = devolverNumerosPares();
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);

            System.err.println(e.getMessage());
        }
        System.out.printf("Hay %d pares%n", numeroPares);
    }
    public static int devolverNumerosPares() throws FileNotFoundException {
        //abrir el scanner
        Scanner scanner = new Scanner(file);
        int contadorPares = 0;
        while (scanner.hasNextLine()) {
            String sNumero = scanner.nextLine();
            if (! sNumero.matches("[0-9]+"))
                continue;
            int    iNumero = Integer.parseInt(sNumero);
            if (iNumero % 2 == 0)
                contadorPares++;
        }
        scanner.close();
        return contadorPares;
    }
}





