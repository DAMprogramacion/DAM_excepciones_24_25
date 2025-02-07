package ejercicios.ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Numero> numeros = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("ficheros/hexadecimal.txt"))) {
            while (scanner.hasNextLine()) {
                String numero = "";
                try {
                    numero = scanner.nextLine();
                    numeros.add(new Numero(SistemaNumerico.HEXADECIMAL, numero));
                    System.out.printf("Leído: %S%n", numero);
                } catch (Exception e) {
                    System.err.println(numero + ": " + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.err.println(e.getMessage());
        }
        int suma1 = numeros.stream().
                mapToInt(Numero::calcularValorDecimal)
                .sum();

        int suma2 = Numero.calcularSumaDecimal(numeros);

        System.out.printf("%d  -  %d%n", suma1, suma2);

    }
}
