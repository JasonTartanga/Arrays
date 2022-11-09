package arrays;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc = 6;
		int filas = 0;
		int columnas = 0;
		int[][] MatrizA = new int[0][0];
		int[][] MatrizB = new int[0][0];
		int[][] MatrizC = new int[3][3];
		do {
			switch (opc) {
			case 1:
				for (int i = 0; i < MatrizA.length; i++) { 
			        for (int j = 0; j < MatrizA[i].length; j++) {
			           MatrizC[i][j] = (int) MatrizA[i][j] + (int) MatrizB[i][j];
			        }
			     }
				System.out.println("\n---------------MATRIZ C---------------");
				for (int i = 0; i < MatrizC.length; i++) { 
			        for (int j = 0; j < MatrizC[i].length; j++) {
			            System.out.print(MatrizC[i][j] + " " );
			        }
			        System.out.println();
			    }
				break;
			case 2:
				for (int i = 0; i < MatrizA.length; i++) { 
			        for (int j = 0; j < MatrizA[i].length; j++) {
			           MatrizC[i][j] = (int) MatrizB[i][j] - (int) MatrizA[i][j];
			        }
			     }
				System.out.println("\n---------------MATRIZ C---------------");
				for (int i = 0; i < MatrizC.length; i++) { 
			        for (int j = 0; j < MatrizC[i].length; j++) {
			            System.out.print(MatrizC[i][j] + " " );
			        }
			        System.out.println();
			    }
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				System.out.println("\nLa matriz A: ");
			    for (int i = 0; i < MatrizA.length; i++) { 
			        for (int j = 0; j < MatrizA[i].length; j++) {
			            System.out.print(MatrizA[i][j] + " " );
			        }
			        System.out.println();
			    }
			    System.out.println("\nLa matriz B: ");
			    for (int i = 0; i < MatrizB.length; i++) { 
			        for (int j = 0; j < MatrizB[i].length; j++) {
			            System.out.print(MatrizB[i][j] + " " );
			        }
			        System.out.println();
			    }
				break;
			case 6:
				System.out.println("---------------MATRIZ A---------------");
				System.out.print("Introduce el numero de lineas: ");
				filas = sc.nextInt();
				System.out.print("Introduce el numero de columnas: ");
				columnas = sc.nextInt();
				
				MatrizA = new int[filas][columnas];
			
				for (int i = 0; i < filas; i++) {
					for (int j = 0; j < columnas; j++) {
						System.out.print("A[" + (i+1) + "][" + (j+1) + "]= ");
						MatrizA[i][j] = sc.nextInt();
					}
				}
				System.out.println("\n---------------MATRIZ B---------------");
				System.out.print("Introduce el numero de lineas: ");
				filas = sc.nextInt();
				System.out.print("Introduce el numero de columnas: ");
				columnas = sc.nextInt();
				
				MatrizB = new int[filas][columnas];
			
				for (int i = 0; i < filas; i++) {
					for (int j = 0; j < columnas; j++) {
						System.out.print("B[" + (i+1) + "][" + (j+1) + "]= ");
						MatrizB[i][j] = sc.nextInt();
					}
				}
				break;
			case 7:
				break;

			default:
				System.out.println("Introduce una opcion valida");
				break;
			}
			System.out.println("\n1- Sumar");
			System.out.println("2- Restar");
			System.out.println("3- Multiplicar");
			System.out.println("4- Dividir");
			System.out.println("5- Mostrar matrices");			
			System.out.println("6- Cambiar matrices");
			System.out.println("7- Salir");
			opc = sc.nextInt();
		}while(opc != 7);
		System.out.println("Has decidido salir");
		sc.close();
	}
}
