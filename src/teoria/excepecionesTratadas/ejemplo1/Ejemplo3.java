package teoria.excepecionesTratadas.ejemplo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) throws FileNotFoundException {
        Ciclo dam = new Ciclo("DAM");
        Scanner scanner = new Scanner(new File("ficheros/uno.txt"));
    }
}
