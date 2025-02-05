package ejercicios.ejercicio1;

public class TrianguloException extends Exception{
    @Override
    public String getMessage() {
        return "Triángulo no válido";
    }
}
