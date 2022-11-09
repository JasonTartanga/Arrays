package arrays;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] Numeros = new int[10];

		for (int i = 0; i < Numeros.length; i++) {
			Numeros[i] = (int) (Math.random() * 99 + 1);
		}
		System.out.println("--------------DESORDENADOS--------------");
		for (int i = 0; i < Numeros.length; i+=2) {
			System.out.println(Numeros[i] + " " + Numeros[i + 1]);
		}
	
		System.out.println("---------------ORDENADOS----------------");
		for (int i = 0; i < Numeros.length; i++) {
			for (int j = i + 1; j < Numeros.length; j++) {
				if (Numeros[j] < Numeros[i]) {
					int intercambio = Numeros[i];
					Numeros[i] = Numeros[j];
					Numeros[j] = intercambio;
				}

			}
			System.out.println(Numeros[i]);
		}
		sc.close();
	}

}
