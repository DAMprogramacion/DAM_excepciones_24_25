package teoria.excepecionesTratadas.ejemplo1;

import java.util.HashMap;
import java.util.Map;

public class Ciclo {
    private final String nombreCiclo;
    private final Map<String, Alumno> alumnos = new HashMap<>();

    public Ciclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
    }

    public String getNombreCiclo() {
        return nombreCiclo;
    }

    public Map<String, Alumno> getAlumnos() {
        return alumnos;
    }
    public void addAlumno (Alumno alumno) {
        alumnos.put(alumno.dni(), alumno);
    }
    public Alumno buscarAlumnoPorDNI (String dni) {
        return alumnos.get(dni);
    }
}
