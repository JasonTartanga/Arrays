package arrays;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];
		int numero;
	

		for (int i = 0; i < array.length; i++) {
			System.out.printf("Introduce el %sº numero: ", (i + 1));
			numero = sc.nextInt();
			int igual = 0;
			for (int j = 0; j < array.length; j++) {
				if(array[j] == numero) {
					igual++;
				}
			}
			if(igual == 0) {
				array[i] = numero;
			}else {
				System.out.println("El numero ya ha sido escrito!");
				i--;
			}

		}
		sc.close();
	}

}
