package Ejercicio2.java;

public class Suma extends Operacion {
    public Suma(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double calcularResultado() {
        return numero1 + numero2;
    }

    @Override
    public void mostrarResultado() {
        System.out.println("Resultado de la Suma: " + calcularResultado());
    }
}