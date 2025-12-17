/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
         
        String[] estaciones = new String[5]; 
        double [][] produccion = new double[5][12];
        double [] total_produccion = new double[5];
        
        for(int f=0; f< estaciones.length; f++ ){
            System.out.println("Ingrese el nombre del encargado de la estación");
            estaciones[f] = entrada.nextLine();
            
            
        }

    }
}
