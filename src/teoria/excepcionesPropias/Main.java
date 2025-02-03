package teoria.excepcionesPropias;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //crear dos objetos persona, uno con dni válido y otro dni no vaĺido
        Persona persona1 = null, persona2 = null;
        try {
            persona2 = new Persona(
                    "joaquina abolafia", LocalDate.of(2000, 10, 23),
                    "2345678a");
           /* persona1 = new Persona(
                    "joaquin abolafia", LocalDate.of(2000, 1, 23),
                    "12345678a");*/
        } catch (DNIException e) {
            System.err.println(e.getMessage());
        }
        try {
            persona1 = new Persona(
                    "joaquin abolafia", LocalDate.of(2000, 1, 23),
                    "12345678a");
        } catch (DNIException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Persona 1: " + persona1);
        System.out.println("Persona 2: " + persona2);


    }
}
