package arrays;

public class Ejercicio12 {

	public static void main(String[] args) {
		int filas = 5;
		int columnas = 4;

		int[][] Matriz = new int[filas][columnas];


		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				Matriz[i][j] = (int) (Math.random() * 100 - 50);

			}

		}
		
		System.out.println("---------------ORDENADO---------------");
		for (int i = 0; i < Matriz.length; i++) { 
	        for (int j = 0; j < Matriz[i].length; j++) {
	            System.out.print(Matriz[i][j] + " " );
	        }
	        System.out.println();
	    }
		System.out.println();
		System.out.println("---------------DESORDENADO---------------");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println(Matriz[i][j]);
			}
		}
	}

}
