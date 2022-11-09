package arrays;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

// Scanner, Arrays y variables
		Scanner sc = new Scanner(System.in);

		String[] Nombre = new String[5];
		int[] Nota = new int[5];

		int opc = 0;
		int Nota1;
		int Num = 0;
		String continuar;
		int mejorAlumno = 0;
		String Alumno;
		Boolean notaValida = false;

// Preguntamos nombres y notas
		for (int i = 0; i < Nombre.length; i++) {
			System.out.printf("Introduce el %sº nombre: ", (i + 1));
			Nombre[i] = sc.next();

			System.out.printf("Introduce la nota de %s : ", Nombre[i]);
			do {
				Nota1 = sc.nextInt();

				notaValida = true;
				if (Nota1 >= 0 && Nota1 <= 10) {
					Nota[i] = Nota1;
				} else {
					System.out.print("Introduce una nota valida: ");
					notaValida = false;
				}
			} while (!notaValida);
		}
		do {

// Menu
			System.out.println();
			System.out.println("1. Visualizar nombres y sus notas");
			System.out.println("2. Visualizar sólo el nombre de la persona con mayor nota");
			System.out.println("3. Visualizar la media de las notas");
			System.out.println("4. Visualizar el número de veces que aparece una nota");
			System.out.println("5. Mostrar notras de un alumno especifico");
			System.out.println("6. Introducir nuevas notas a quien queramos");
			System.out.println("7. Clasificar de mayor a menor");
			System.out.println("8. Salir");

			opc = sc.nextInt();
			switch (opc) {

// Mostramos la nota de cada estudiante
			case 1:
				System.out.println();

				for (int i = 0; i < Nombre.length; i++) {
					System.out.printf("La nota de %s es: %s\n", Nombre[i], Nota[i]);
				}
				break;

// Mostramos unicamente la nota mas alta
			case 2:
				System.out.println();

				int Mayor = 0;

				for (int i = 0; i < Nombre.length; i++) {
					if (Nota[i] > Mayor) {
						Mayor = Nota[i];
						mejorAlumno = i;
					}
				}
				System.out.printf("El que tiene la nota mas alta es %s : %s\n", Nombre[mejorAlumno], Mayor);
				break;

// Mostramo la media
			case 3:
				System.out.println();

				int Media = 0;

				for (int i = 0; i < Nombre.length; i++) {
					Media += Nota[i];
				}
				System.out.println("La nota media es: " + (float) Media / Nombre.length);
				break;

//Mostrar cantidad de veces que aparece X numero
			case 4:
				System.out.println();

				int contador = 0;

				System.out.print("Introduce un numero: ");
				Num = sc.nextInt();
				for (int i = 0; i < Nombre.length; i++) {
					if (Nota[i] == Num) {
						contador++;
					}
				}
				System.out.printf("El numero %s ha aparecido %s veces\n", Num, contador);
				break;

//Darnos la nota de un alumno
			case 5:
				System.out.println();
				Boolean hayAlumno = false;

				System.out.print("Introduce el nombre de un alumno: ");
				Alumno = sc.next();
				for (int i = 0; i < Nombre.length; i++) {
					if (Nombre[i].contains(Alumno)) {
						System.out.println(Alumno + " ha sacado un " + Nota[i]);
						hayAlumno = true;
					}
				}
				if (!hayAlumno) {
					System.out.println("No hay ningun alumno con ese nombre");
				}
				break;

//Cambiar nota
			case 6:
				System.out.println();

				for (int i = 0; i < Nombre.length; i++) {
					System.out.printf("Quieres cambiar el nombre de %s (S,N)", Nombre[i]);
					continuar = sc.next().toUpperCase();
					if (continuar.charAt(0) == 'S') {
						do {
							System.out.println("Introduce la nueva nota de " + Nombre[i]);
							Nota1 = sc.nextInt();
							notaValida = true;
							if (Nota1 >= 0 && Nota1 <= 10) {
								Nota[i] = Nota1;
							} else {
								System.out.println("Introduce una nota valida");
								;
								notaValida = false;
							}
						} while (!notaValida);
					}
				}
				break;

//Ordenar de mayor a menor
			case 7:
				System.out.println();

				int intercambio;
				String intercambio1;

//Bucle burbuja
				for (int i = 0; i < Nota.length; i++) {
					for (int j = i + 1; j < Nota.length; j++) {
						if (Nota[j] > Nota[i]) {

//Ordenar notas
							intercambio = Nota[i];
							Nota[i] = Nota[j];
							Nota[j] = intercambio;

//Ordenar Nombres
							intercambio1 = Nombre[i];
							Nombre[i] = Nombre[j];
							Nombre[j] = intercambio1;
						}
					}
					System.out.println((i + 1) + "º " + Nombre[i] + " : " + Nota[i]);
				}
				break;

			case 8:
				break;

			default:
				System.out.println("Introduce una opcion valida");
				break;
			}
		} while (opc != 8);
		System.out.println("Has decidido no contiuar");
		sc.close();
	}

}