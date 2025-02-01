package teoria.excepecionesNoTratadas;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sDenominador = "", sNumerador = "";
        String regexNumerosEnteros = "-?[0-9]+";

        do {
            System.out.println("Introduce numerador entero:");
            sNumerador = sc.nextLine();
            System.out.println("Introduce denominador entero:");
            sDenominador = sc.nextLine();
        } while ( sDenominador.equals("0") ||
                ! sNumerador.matches(regexNumerosEnteros) ||
                ! sDenominador.matches(regexNumerosEnteros));

        int iNumerador   = Integer.parseInt(sNumerador);
        int iDenominador = Integer.parseInt(sDenominador);
        int division = iNumerador / iDenominador;
        System.out.printf("%d / %d = %d%n", iNumerador, iDenominador, division);

    }
}
