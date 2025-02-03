package teoria.excepcionesPropias;

import java.time.LocalDate;

public class Persona {
    //dni, fecha nacimiento, nombre
    private final String nombrePersona;
    private final LocalDate fechaNacimiento;
    private final String dni;

    public Persona(String nombrePersona, LocalDate fechaNacimiento, String dni)
            throws DNIException {
        if (Helper.validarDNI(dni)) {
            this.nombrePersona = nombrePersona;
            this.fechaNacimiento = fechaNacimiento;
            this.dni = dni;
        }
        else throw new DNIException();
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s", nombrePersona, dni, fechaNacimiento);
    }
}
