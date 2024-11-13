/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package zamira.estudiante.zamirashiguango2020;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ZamiraShiguango2020 {

    public static void main(String[] args) {

        float[] ventas = new float[7];

        float totalVentas;
        float promedioVentas;
        float datos = 0;
        float z = 0;
        
        

        Scanner sandy = new Scanner(System.in);

        do {
            for (int i = 0; i < 7; i++) {
                System.out.println("Ingrese el monto de ventas de los dias de la semana: ");
                datos = sandy.nextFloat();
               

            }
            
            if (datos > 0) {
                int j=0;
                    ventas[j] = datos;
                    j++;
                } else {
                    System.out.println("El valor es negativo, ingrese de nuevo");
                }
            } while (z < 7);
            

            System.out.println("Elija una opcion");

            System.out.println("1. Calcular el total de ventas de la semana");
            System.out.println("2. Calcular el dia con ventas más cercanas al promedio");
            System.out.println("3. Mostrar el dia con la venta más alta y el dia con la venta más baja");
            System.out.println("4. Calcular el monto acumulado de ventas durante los primeros tres dias y los ultimos tres dias");
            System.out.println("Salir");

            int menu = sandy.nextInt();

            switch (menu) {
                case 1:

                    float suma = 0;
                    for (int i = 0; i < 7; i++) {
                        suma = ventas[i] + suma;
                    }

                    totalVentas = suma;

                    System.out.println("El total de las ventas es: " + totalVentas);
                    break;
                    

                case 2:
                    
                   /* promedioVentas = totalVentas/7;*/
                           
                    

                    System.out.println("");
                    break;

                case 3:
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("");
                    break;

            }

        

    }
}
