package ejercicios.ejercicio1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {

    @Test
    void validarTriangulo() {
        assertTrue(Triangulo.validarTriangulo(1,1,1));
        assertTrue(Triangulo.validarTriangulo(7,7,1));
        assertTrue(Triangulo.validarTriangulo(3,4,5));
        assertFalse(Triangulo.validarTriangulo(1,1,5));
    }

    @Test
    void testValidarTriangulo()  {
        assertThrows(TrianguloException.class, () -> Triangulo.getInstance(1, 2, 7));
    }
}