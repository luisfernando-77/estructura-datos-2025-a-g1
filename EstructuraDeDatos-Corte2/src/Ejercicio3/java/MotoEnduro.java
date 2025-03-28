package Ejercicio3.java;

public class MotoEnduro extends Moto {
    private boolean aptaTerrenosDificiles;

    public MotoEnduro(String marca, String modelo, int cilindrada, boolean aptaTerrenosDificiles) {
        super(marca, modelo, cilindrada);
        this.aptaTerrenosDificiles = aptaTerrenosDificiles;
    }

    @Override
    public void mostrarDetalles() {
        String terreno = aptaTerrenosDificiles ? "Sí" : "No";
        System.out.println(" Moto Enduro: " + marca + " " + modelo + " - " + cilindrada + "cc - Apta para terrenos difíciles: " + terreno + ".");
    }
}