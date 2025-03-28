package Ejercicio2.java;

public class Division extends Operacion {
    public Division(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double calcularResultado() {
        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN;
        }
        return numero1 / numero2;
    }

    @Override
    public void mostrarResultado() {
        if (numero2 != 0) {
            System.out.println("Resultado de la División: " + calcularResultado());
        }
    }
}
