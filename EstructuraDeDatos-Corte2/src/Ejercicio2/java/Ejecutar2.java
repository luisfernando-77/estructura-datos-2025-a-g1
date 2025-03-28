package Ejercicio2.java;

public class Ejecutar2 {
    public static void main(String[] args) {
        System.out.println("Realizando Operaciones Matemáticas:");

        Suma suma = new Suma(20, 10);
        suma.mostrarResultado(); // 15.0

        Resta resta = new Resta(15, 15);
        resta.mostrarResultado(); // 5.0

        Multiplicacion multiplicacion = new Multiplicacion(100, 2);
        multiplicacion.mostrarResultado(); // 50.0

        Division division = new Division(20, 10);
        division.mostrarResultado(); // 2.0

        System.out.println("Intentando dividir entre 0:");
        Division divisionCero = new Division(40, 0);
        divisionCero.mostrarResultado(); // Error
    }
}
