package teoria.excepcionesPropias;

public class Helper {
    //validar dni
    public static boolean validarDNI (String dni) {
        return dni.toLowerCase().matches("[0-9]{8}[a-z]");
    }
}
