package arrays;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int Numeros[] = new int[15];
		int Numeros2[] = new int[15];
		int opc = 6;
		String claveReal = "1234";
		String claveIntento;
		do {

			switch (opc) {
			case 1:
				for (int i = 0; i < Numeros.length; i++) {
					System.out.print(Numeros[i] + (i==(Numeros.length-1)?" ":" --> "));
				}
				break;
			case 2:
				int max = Numeros[0];
				for (int i = 0; i < Numeros.length; i++) {
					if (Numeros[i] > max) {
						max = Numeros[i];
					}
				}
				System.out.println("El numero mas grande es: " + max);
				break;
			case 3:
				int suma = 0;
				for (int i = 0; i < Numeros.length; i++) {
					suma += Numeros[i];
				}
				System.out.println(suma);
				break;
			case 4:
				System.out.print("Introduce un numero: ");
				int num = sc.nextInt();
				int iguales = 0;

				for (int i = 0; i < Numeros.length; i++) {
					if (num == Numeros[i]) {
						iguales++;
					}
				}
				System.out.println("Hay " + iguales + " numeros iguales");
				break;
			case 5:
				for (int i = 3; i > 0; i--) {
					System.out.print("Introduce la clave: ");
					claveIntento = sc.next();
				if(claveIntento.length() == 4) {
					if (claveIntento == claveReal) {
						System.out.println("La clave es correcta");

						for (int j = 0; j < Numeros.length; j++) {
							Numeros[j] = 0;
						}
					}else if (i == 1) {
						System.out.println("Te has quedado sin intentos");
					}else {
						System.out.println("Clave no correcta. Te quedan " + (i - 1) + " intentos");
					}
				}
				else{
					System.out.println("Introduce una clave con 4 digitos");
					System.out.println("Clave no correcta. Te quedan " + (i - 1) + " intentos");
					i++;
				}
				}
				

				break;
			case 6:
				for (int i = 0; i < Numeros.length; i++) {
					System.out.print("Introduce el " + (i + 1) + "º numero: ");
					Numeros[i] = sc.nextInt();
				}

				break;
			case 7:
				int intercambio;
				for (int i = 0; i < Numeros.length; i++) {
					Numeros2[i] = Numeros[i];
				}

				for (int i = 0; i < Numeros2.length; i++) {
					for (int j = i + 1; j < Numeros2.length; j++) {
						if (Numeros2[j] > Numeros2[i]) {
							intercambio = Numeros2[i];
							Numeros2[i] = Numeros2[j];
							Numeros2[j] = intercambio;
						}
						System.out.print(Numeros[i] + (i==(Numeros.length-1)?" ":" --> "));
					}
				}
				break;
			case 8:
				break;

			default:
				System.out.println("Introduce una opcion valida");
				break;
			}
			System.out.println(
					"1- Visualizarlos. \n2- Visualizar sólo el mayor de todos\n3- Visualizar la suma de todos ellos.\n4- Visualizar el número de veces que un número pedido por teclado aparece en la lista.\n5- Poner toda la tabla a ceros. Ha de conocer la clave necesaria para tener ese privilegio. Tendrá 3 oportunidades para introducir la clave correcta. La clave será un nº de 4 cifras.\n6- Introducir nuevos datos\n7- Clasificar de mayor a menor.\n8- SALIR");
			opc = sc.nextInt();

		} while (opc != 8);
		System.out.println("Has decidido no continuar");
		sc.close();
	}

}