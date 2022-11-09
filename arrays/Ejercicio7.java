package arrays;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int array[] = { 8, 17, 21, 3, 11, 7, 28 };
		int respuesta = 0;

		for (int i = 2; i >= 0 && (respuesta >= 0 && respuesta <= 6); i--) {
			System.out.print("Introduce un numero entre 0 y 6: ");
			respuesta = sc.nextInt();

			if (respuesta >= 0 && respuesta <= 6) {
				System.out.println("Tu numero seleccionado es: " + array[respuesta]);
			} else {
				System.out.printf("Numero erroneo tienes %s intentos \n", i);
			}
		}
		sc.close();
	}

}
