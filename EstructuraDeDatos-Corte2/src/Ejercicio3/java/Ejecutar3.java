package Ejercicio3.java;
public class Ejecutar3 {
    public static void main(String[] args) {
        System.out.println(" Probando sistema de motos \n");

        MotoDeportiva deportiva = new MotoDeportiva("Yamaha", "R1", 1000, 299);
        deportiva.mostrarDetalles();
        deportiva.encender();
        deportiva.apagar();

        System.out.println("\n");

        MotoTurismo turismo = new MotoTurismo("BMW", "R1250GS", 1250, 30);
        turismo.mostrarDetalles();
        turismo.encender();
        turismo.apagar();

        System.out.println("\n");

        MotoEnduro enduro = new MotoEnduro("KTM", "450 EXC-F", 450, true);
        enduro.mostrarDetalles();
        enduro.encender();
        enduro.apagar();
    }
}
