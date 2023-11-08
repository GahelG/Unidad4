/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner ;
/**
 *
 * @author gazz
 */
public class Mavenproject1 {

    public static void main(String[] args) {
         char L[][] = new char[3][5];
        char Letras = 'A';


        for (int i = 0; i < L.length; i++) {
            for (int j = 0; j < L[i].length; j++) {
               L[i][j] = Letras;
                Letras++;
            }
        }

        for (char[] L2 : L) {
            for (int j = 0; j < L2.length; j++) {
                System.out.print(L2[j] + "\t");
            }
            System.out.println(" ");
        }
    }

}

