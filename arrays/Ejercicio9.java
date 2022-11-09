package arrays;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array = new int[10];
		int[] arraySuperior = new int[10];
		int num = 0;
		boolean haySuperior = false;
		boolean notaValida;

		do {
			notaValida = false;

			System.out.print("Introduce un numero de el 1 al 500: ");
			num = sc.nextInt();

			if (num >= 1 && num <= 500) {
				for (int i = 0; i < array.length; i++) {
					array[i] = (int) (Math.random() * 499 + 1);
					notaValida = true;
				}
			}
		} while (!notaValida);

		for (int i = 0; i < array.length; i++) {
			if (num < array[i]) {
				arraySuperior[i] = array[i];
				haySuperior = true;
			}
		}

		if (haySuperior) {
			System.out.println("Los numeros superiores a " + num + " son:");

			for (int i = 0; i < arraySuperior.length; i++) {
				if (arraySuperior[i] != 0) {
					System.out.println(arraySuperior[i]);
				}
			}
		} else {
			System.out.println("No hay numeros superiores");
		}

		sc.close();
	}
}