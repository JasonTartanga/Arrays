package arrays;

import java.util.Scanner;

public class MATRIZ {

	public static void main(String[] args) {
		//Creamos Scanner y declaramos variables
		Scanner sc = new Scanner(System.in);

		int filas = 0;
		int columnas = 0;
		char opc = 'S';
		
		//Creamos bulce hasta que usuario decida salir
		do {
			
		//Introducimos Nº de lineas y columnas
			System.out.print("Introduce el numero de lineas: ");
			filas = sc.nextInt();
			System.out.print("Introduce el numero de columnas: ");
			columnas = sc.nextInt();
			
			int[][] Matriz = new int[filas][columnas];
		
		//Preguntamos valores en cada celda
			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < columnas; j++) {
					System.out.print("A[" + (i+1) + "][" + (j+1) + "]= ");
					Matriz[i][j] = sc.nextInt();
				}
			}
		
		//Escribimos la matriz en la consola
			System.out.println("\nLa matriz A: ");
		    for (int i = 0; i < Matriz.length; i++) { 
		        for (int j = 0; j < Matriz[i].length; j++) {
		            System.out.print(Matriz[i][j] + " " );
		        }
		        System.out.println();
		    }
		    
		//Preguntamos si continuar
		    System.out.println("\n¿Continuar? (S,N)");
		    opc = sc.next().toUpperCase().charAt(0);
		    
		}while(opc == 'S');
		
		System.out.println("Has decidido no continuar");
		sc.close();
	}
}