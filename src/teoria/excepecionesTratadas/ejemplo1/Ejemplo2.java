package teoria.excepecionesTratadas.ejemplo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        Ciclo dam = new Ciclo("DAM");
        try (Scanner scanner = new Scanner(new File("icheros/uno.txt"))) {
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.err.println("con problema, no existe el fichero");
        }
    }
}
