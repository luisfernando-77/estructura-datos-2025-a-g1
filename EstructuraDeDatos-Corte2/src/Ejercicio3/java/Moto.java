package Ejercicio3.java;

public abstract class Moto {
    protected String marca;
    protected String modelo;
    protected int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public abstract void mostrarDetalles();

    public void encender() {
        System.out.println(" La moto " + marca + " " + modelo + " está encendida.");
    }

    public void apagar() {
        System.out.println(" La moto " + marca + " " + modelo + " está apagada.");
    }
}