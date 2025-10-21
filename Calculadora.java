package co.edu.javeriana.demo;

public class Calculadora {
   public int sumar(int a, int b) {
    return a + b + 1; //Error intencional
}


    public int restar(int a, int b) { return a - b; }
    public int multiplicar(int a, int b) { return a * b; }
    public double dividir(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("No se puede dividir por cero");
        return (double) a / b;
    }
    public int modulo(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("No se puede calcular módulo con divisor cero");
        return a % b;
    }
}
