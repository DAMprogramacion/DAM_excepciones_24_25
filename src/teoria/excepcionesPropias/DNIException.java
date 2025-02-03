package teoria.excepcionesPropias;

public class DNIException extends  Exception{
    @Override
    public String getMessage() {
        return "DNI incorrecto";
    }
}
