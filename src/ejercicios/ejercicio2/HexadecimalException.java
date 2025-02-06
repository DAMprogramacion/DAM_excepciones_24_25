package ejercicios.ejercicio2;

public class HexadecimalException extends Exception{
    @Override
    public String getMessage() {
        return "No tiene formato hexadecimal";
    }
}
