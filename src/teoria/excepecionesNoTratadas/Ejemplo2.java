package teoria.excepecionesNoTratadas;

import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sDenominador = "", sNumerador = "";

        do {
            System.out.println("Introduce numerador double:");
            sNumerador = sc.nextLine();
            System.out.println("Introduce denominador double:");
            sDenominador = sc.nextLine();
        } while (! ejerciciosRegex.Helper.validarNumerosReales(sNumerador) ||
                 ! ejerciciosRegex.Helper.validarNumerosReales(sDenominador) );
        sDenominador = sDenominador.replace(',', '.');
        sNumerador = sNumerador.replace(',', '.');
        double dNumerador   = Double.parseDouble(sNumerador);
        double dDenominador = Double.parseDouble(sDenominador);
        Double division = dNumerador / dDenominador;
        if (division.isInfinite())
            System.out.println("La división es infinita");
         else if (division.isNaN())
            System.out.println("La división es una indeterminación");
        else
            System.out.printf("%.2f / %.2f = %.2f%n", dNumerador, dDenominador, division );
    }
}







