/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramides;

import java.util.Scanner;

/**
 *
 * @author GAzz
 */
public class Piramides {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu ");
            System.out.println("1. Piramide Asteriscos");
            System.out.println("2. Piramide Letras");
            System.out.print("Seleccione una opcion:");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el numero de filas de la piramide: ");
                    int filasAsteriscos = scanner.nextInt();
                    piramideAsteriscos(filasAsteriscos);
                    break;
                case 2:
                    System.out.print("Ingrese el numero de filas de la piramide: ");
                    int filasLetras = scanner.nextInt();
                    piramideLetras(filasLetras);
                    break;

                default:
                    return;
            }
        }
    }

    static void piramideAsteriscos(int filas) {
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void piramideLetras(int filas) {
        int letras = 65;

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) letras);
                letras++;
            }
            System.out.println();
        }
    }
}
