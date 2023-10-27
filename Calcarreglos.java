/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calcarreglos;
import java.util.Scanner;

public class Calcarreglos {
    public static void main(String[] args) {
        double nums[] = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        System.out.println("Deseas multiplicar o sumar los numeros del arreglo?");
        System.out.println("1. Sumar");
        System.out.println("2. Multiplicar");
        System.out.println("0. Salir");
        
        int opcion;
        Scanner scan = new Scanner(System.in);
        opcion = scan.nextInt();
        
        while (opcion != 0) {
            switch (opcion) {
                case 1: {
                    double suma = 0; 
                    for (int i = 0; i < nums.length; i++) {
                        suma += nums[i]; 
                    }
                    System.out.println("Resultado de la suma: " + suma);
                    break;
                }
                case 2: {
                    double producto = 1;
                    for (int i = 0; i < nums.length; i++) {
                        producto *= nums[i]; 
                    }
                    System.out.println("Resultado de la multiplicacion: " + producto);
                    break;
                }
                default:
                    System.out.println("Opcion no valida. Reconsidera.");
            }
            
            System.out.println("Deseas multiplicar o sumar los numeros del arreglo?");
            System.out.println("1. Sumar");
            System.out.println("2. Multiplicar");
            System.out.println("0. Salir");
            opcion = scan.nextInt();
        }
    }
}
