package Ejercicio2.java;

public class Multiplicacion extends Operacion {
    public Multiplicacion(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double calcularResultado() {
        return numero1 * numero2;
    }

    @Override
    public void mostrarResultado() {
        System.out.println("Resultado de la Multiplicación: " + calcularResultado());
    }
}