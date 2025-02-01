package teoria.excepecionesTratadas.ejemplo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        Ciclo dam = new Ciclo("DAM");
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("ficheros/uno.txt"));
            System.out.println("sin problema en la lectura del fichero");
            reportarFichero(scanner);
            crearCiclo(scanner, dam);
            System.out.println(dam.getAlumnos());
        } catch (FileNotFoundException e) {
            System.err.println("con problema, no existe el fichero");
           // throw new RuntimeException(e);
            //e.printStackTrace();
        } finally {
            if (scanner != null) {
                System.out.println("cerrando scanner");
                scanner.close();
            }

        }
        System.out.println("Fin de programa");
    }

    private static void crearCiclo(Scanner scanner, Ciclo dam) {
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] tokens = linea.split(",");
            Alumno alumno = new Alumno(tokens[0],tokens[1], tokens[2] );
            dam.addAlumno(alumno);
        }
    }

    private static void reportarFichero(Scanner scanner) {
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            System.out.println(linea);
        }
    }




}
