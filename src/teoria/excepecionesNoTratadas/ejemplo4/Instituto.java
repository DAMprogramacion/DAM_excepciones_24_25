package teoria.excepecionesNoTratadas.ejemplo4;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Instituto {
    private final String nombreInstituto;
    private final Map<String, Persona> personas = new HashMap();

    public Instituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }
    public void addPersona (Persona persona) {
        personas.put(persona.dni(), persona);
    }
    public Persona buscarPersonaPorDNI (String dni){
        return personas.get(dni);  //si no existe el dni devuelve un null
    }
    public Optional<Persona> buscarOpersonaPorDNI (String dni){
        return Optional.ofNullable(personas.get(dni));  //si no existe el dni devuelve un null
    }

}
