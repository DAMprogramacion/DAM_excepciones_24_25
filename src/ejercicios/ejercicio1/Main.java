package ejercicios.ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
    List<Triangulo> triangulos = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("ficheros/triangulos.csv"))) {
            scanner.nextLine();  //omito la cabecera
            while (scanner.hasNextLine()) {
                String[] tokens = scanner.nextLine().split(",");
                try {
                    if (!(tokens[0].matches("[\\d]+")  && tokens[1].matches("[\\d]+")
                        && tokens[2].matches("[\\d]+")))
                            continue;
                    Triangulo triangulo = Triangulo.getInstance(Integer.parseInt(tokens[0]),
                            Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    System.out.printf("Leido triangulo l1: %s, l2: %s, l3: %s%n", tokens[0],
                            tokens[1], tokens[2]);
                    triangulos.add(triangulo);
                }
                catch (TrianguloException e) {
                    System.err.print(e.getMessage());;
                    System.err.println(" " + tokens[0] + "-" + tokens[1] + "-" + tokens[2]);;
                }
            }

        } catch (FileNotFoundException  e) {
            System.err.println(e.getMessage());;
        }
        System.out.printf("Nº de triángulos leídos: %d%n", triangulos.size());

        /*int suma = 0;
        for(Triangulo triangulo : triangulos) {
            suma += triangulo.getPerimetro();
        }*/
        int suma = triangulos.stream().
                mapToInt(Triangulo::getPerimetro).
                sum();

        System.out.printf("La suma de todos los perímetros vale: %d%n", suma);


    }
}
