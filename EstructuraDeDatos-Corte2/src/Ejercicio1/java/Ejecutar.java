package Ejercicio1.java;

public class Ejecutar {
    public static void main(String[] args) {
        System.out.println("Calculando Áreas de Figuras:");

        Circunferencia circunferencia = new Circunferencia(3);
        circunferencia.mostrarArea();  // 78.54

        Cuadrado cuadrado = new Cuadrado(6);
        cuadrado.mostrarArea();  // 16.0

        Rectangulo rectangulo = new Rectangulo(10, 5);
        rectangulo.mostrarArea();  // 18.0

        Triangulo triangulo = new Triangulo(9, 7);
        triangulo.mostrarArea();  // 20.0
    }
}
