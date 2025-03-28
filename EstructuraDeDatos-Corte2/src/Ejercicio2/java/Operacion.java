package Ejercicio2.java;

public  abstract class Operacion {
    protected double numero1;
    protected double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public abstract double calcularResultado(); // Método abstracto

    public void mostrarResultado() {
        System.out.println("El resultado es: " + calcularResultado());
    }
}