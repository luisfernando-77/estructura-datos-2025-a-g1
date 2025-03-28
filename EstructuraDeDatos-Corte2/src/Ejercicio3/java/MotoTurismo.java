package Ejercicio3.java;

public class MotoTurismo extends Moto {
    private double capacidadTanque;

    public MotoTurismo(String marca, String modelo, int cilindrada, double capacidadTanque) {
        super(marca, modelo, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(" Moto de Turismo: " + marca + " " + modelo + " - " + cilindrada + "cc - Capacidad del tanque: " + capacidadTanque + " litros.");
    }
}