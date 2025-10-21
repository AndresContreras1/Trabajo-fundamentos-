package co.edu.javeriana.demo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests de Calculadora")
public class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    void setUp() { calculadora = new Calculadora(); }

    @Test @DisplayName("Suma positivos")
    void testSumarPositivos() {
        assertEquals(5, calculadora.sumar(2, 3));
        assertEquals(100, calculadora.sumar(50,50));
    }

    @Test @DisplayName("Suma con negativos")
    void testSumarNegativos() {
        assertEquals(0, calculadora.sumar(-1,1));
        assertEquals(-5, calculadora.sumar(-2,-3));
    }

    @Test @DisplayName("Suma con cero")
    void testSumarConCero() {
        assertEquals(5, calculadora.sumar(5,0));
        assertEquals(0, calculadora.sumar(0,0));
    }

    @Test @DisplayName("Resta")
    void testRestar() {
        assertEquals(2, calculadora.restar(5,3));
        assertEquals(-2, calculadora.restar(3,5));
        assertEquals(0, calculadora.restar(5,5));
    }

    @Test @DisplayName("Multiplicación")
    void testMultiplicar() {
        assertEquals(12, calculadora.multiplicar(3,4));
        assertEquals(0, calculadora.multiplicar(0,5));
        assertEquals(-10, calculadora.multiplicar(-2,5));
    }

    @Test @DisplayName("División")
    void testDividir() {
        assertEquals(2.0, calculadora.dividir(6,3), 1e-3);
        assertEquals(2.5, calculadora.dividir(5,2), 1e-3);
    }

    @Test @DisplayName("Dividir por cero lanza excepción")
    void testDividirPorCero() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> calculadora.dividir(5,0));
        assertTrue(ex.getMessage().contains("cero"));
    }

    @Test @DisplayName("Módulo")
    void testModulo() {
        assertEquals(1, calculadora.modulo(5,2));
        assertEquals(0, calculadora.modulo(10,5));
    }

    // 🔴 TEST FALLIDO INTENCIONAL
    @Test
    @DisplayName("Fallo intencional para pipeline rojo")
    void testFalloIntencional() {
        fail("Fallo intencional para probar pipeline rojo");
    }
}


