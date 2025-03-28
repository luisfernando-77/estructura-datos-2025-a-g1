package Ejercicio3.java;

public class MotoDeportiva extends Moto {
    private int velocidadMaxima;

    public MotoDeportiva(String marca, String modelo, int cilindrada, int velocidadMaxima) {
        super(marca, modelo, cilindrada);
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(" Moto Deportiva: " + marca + " " + modelo + " - " + cilindrada + "cc - Velocidad Máxima: " + velocidadMaxima + " km/h.");
    }
}
