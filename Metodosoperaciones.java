/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosoperaciones;

import java.util.Scanner;
/**
 *
 * @author GAzz
 */
public class Metodosoperaciones {

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2;  
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero :  ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa un numero : ");
        double numero2 = scanner.nextDouble();

        System.out.println("Suma: " + sumar(numero1, numero2));
        System.out.println("Resta: " + restar(numero1, numero2));
        System.out.println("Multiplicacion: " + multiplicar(numero1, numero2));
        System.out.println("Division: " + dividir(numero1, numero2));
    }
}
