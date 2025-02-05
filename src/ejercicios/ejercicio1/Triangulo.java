package ejercicios.ejercicio1;

public class Triangulo {
    private final int lado1;
    private final int lado2;
    private final int lado3;

    private Triangulo(int lado1, int lado2, int lado3) throws TrianguloException {
        if (validarTriangulo(lado1, lado2, lado3)) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        } else {
            throw new TrianguloException();
        }
    }
    public static boolean validarTriangulo(int lado1, int lado2, int lado3){
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }
    public static Triangulo getInstance(int lado1, int lado2, int lado3) throws TrianguloException {
        return new Triangulo(lado1, lado2, lado3);
    }
    //metodo que calcule el perimetro
    public int getPerimetro () {
        return lado1 + lado2 + lado3;
    }
}
