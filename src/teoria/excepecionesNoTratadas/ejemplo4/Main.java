package teoria.excepecionesNoTratadas.ejemplo4;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Instituto instituto = new Instituto("VC");
        Persona persona = new Persona("1", "javier garcía");
        instituto.addPersona(persona);
        persona = new Persona("2", "emilia lozano");
        instituto.addPersona(persona);
        persona = new Persona("3", "luis molero");
        instituto.addPersona(persona);
        for (int i = 1; i < 5; i++) {
            String dni = i + "";
            persona = instituto.buscarPersonaPorDNI(dni);
            if (persona != null)
                System.out.printf("%s: %S%n", dni, persona.nombrePersona());
            else
                System.out.printf("No existe la persona con dni %s%n", dni);
        }
        System.out.println("======================");
        for (int i = 1; i < 5; i++) {
            String dni = i + "";
            Optional<Persona> optionalPersona = instituto.buscarOpersonaPorDNI(dni);
            if (optionalPersona.isPresent())
                System.out.printf("%s: %S%n", dni, optionalPersona.get().nombrePersona());
            else
                System.out.printf("No existe la persona con dni %s%n", dni);
        }

    }
}
