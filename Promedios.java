/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedios;

/**
 *
 * @author GAzz
 */
public class Promedios {
    
    public static double[] promPorEstudiante(double[][] calificaciones){
        
        double[] estudiante = new double[3];
        
         for (int i = 0; i < calificaciones.length ; i++) { 
            double suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) { 
               suma += calificaciones[i][j]; 
            }
           
            estudiante[i] = suma / 4;
        }
         
         return estudiante;
       
    }
    public static double[] promPorMateria(double[][] calificaciones) {
        double[] materia = new double[calificaciones[0].length];

        for (int j = 0; j < calificaciones[0].length; j++) { 
            double suma = 0;
            for (int i = 0; i < calificaciones.length; i++) {
                suma += calificaciones[i][j];
            }
            materia[j] = suma / calificaciones.length;
        }

        return materia;
    }
    public static void main(String[] args) {
        double[][] calificaciones = {
            {90.5, 85.0,78.5,92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5,91.0,87.5},
            
        };
        
      
        System.out.println("Promedio alumnos");
        double[] totalPromedios = Promedios.promPorEstudiante(calificaciones);
        for (int i = 0; i < totalPromedios.length; i++) {
            System.out.println(totalPromedios[i]);
           
        }
        System.out.println("Promedio materias");
        double[] totalPromediosMaterias = Promedios.promPorMateria(calificaciones);
        for (int j = 0; j < totalPromediosMaterias.length; j++) {
            System.out.println(totalPromediosMaterias[j]);
        }
    }
    
    
    
    
}

