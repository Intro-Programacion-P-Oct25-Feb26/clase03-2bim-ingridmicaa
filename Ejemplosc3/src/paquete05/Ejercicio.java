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
        double[][] produccion = new double[5][12];
        double m = 0;
        int indice = 0;
        double[] total = new double[5];

        for (int i = 0; i < estaciones.length; i++) {
            System.out.printf("Ingrese el nombre del encargado de la estación %d: ", i + 1);
            estaciones[i] = entrada.nextLine();

            total[i] = 0;
        }

        for (int j = 0; j < produccion.length; j++) {
            System.out.printf("Producción mensual para %s:\n", estaciones[j]);

            for (int cl = 0; cl < produccion[j].length; cl++) {
                System.out.printf("Mes %d: $", cl + 1);
                produccion[j][cl] = entrada.nextDouble();

                total[j] = total[j] + produccion[j][cl];
            }

            entrada.nextLine();
        }
        for (int f = 0; f < produccion.length; f++) {
            if (total[f] > m) {

                m = total[f];
                indice = f;
            }

        }
        for (int fila = 0; fila < produccion.length; fila++) {
            System.out.println(estaciones[fila] + " - Total Producción: $ "
                    + total[fila]);
        }

        System.out.printf("\nEstación más productiva: %s"
                + "\nEncargado de la estación: %s"
                + "\nCantidad de la estación más productiva: $ %.2f ", estaciones[indice],
                estaciones[indice],
                m);

    }
}
