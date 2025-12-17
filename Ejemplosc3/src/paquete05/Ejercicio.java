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
        double[][] produccion = new double[5][13];
        double[] totalProduccion = new double[5];

        for (int f = 0; f < estaciones.length; f++) {
            System.out.println("Ingrese el nombre del encargado de la estación");
            estaciones[f] = entrada.nextLine();

        }
        for (int i = 0; i < produccion.length; i++) {

            System.out.printf("Ingrese el ingreso mensual de: %s\n", estaciones);
            for (int j = 1; j < produccion[i].length; j++) {

                System.out.printf("Mes %s: $", j);

                produccion[i][j] = entrada.nextDouble();
                totalProduccion[i] = totalProduccion[i] + produccion[i][j];
            }
            entrada.nextLine();

        }
        int indice = 0;
        for (int i = 1; i < 5; i++) {
            if (totalProduccion[i] > totalProduccion[indice]) {
                indice = i;
            }
        }
        System.out.printf("Análisis de Producción\nEstación\n");

        for (int i = 0; i < 5; i++) {
            System.out.printf(
                    "Nombre Estación ", i
                    + " - Total Producción: $ " + totalProduccion[i]);
        }
    }

}
