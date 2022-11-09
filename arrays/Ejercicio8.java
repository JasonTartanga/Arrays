package arrays;

public class Ejercicio8 {

	public static void main(String[] args) {

//Declarar Arrays
		String primerPlato[] = { "Ensalada  ", "Spagetti  ", "Macarrones", "Risotto   ", "Garbanzos ", "Sopa      ",
				"Lentejas  ", "Canelones " };
		String segundoPlato[] = { "Estofado", "Hamburguesa", "Costillas", "Salmon", "Lomo", "Pollo", "Lasaña",
				"Albondigas", "Pizza", "Kebab" };
		String Dia[] = { "Lunes    ", "Martes   ", "Miercoles", "Jueves  ", "Viernes  ", "Sabado   ", "Domingo  " };

//Declaramos las variables
		int[] repetido = new int[8];
		int[] repetido2 = new int[10];
		int primero = 0;
		int segundo = 0;
		boolean iguales1;
		boolean iguales2;

//Le damos estilo al menu
		System.out.println("\t\t\tMENU SEMANAL");
		System.out.println();
		System.out.println("         \tPRIMERO \tSEGUNDO");
		System.out.println();

//Hacemos que el primer plato no se repita
		for (int i = 0; i < Dia.length; i++) {
			primero = (int) (Math.random() * 8);
			iguales1 = false;
			for (int j = 0; j < repetido.length && !iguales1; j++) {
				if (repetido[j] == primero) {
					iguales1 = true;
				}
			}
			if (!iguales1) {
				repetido[i] = primero;
			} else {
				i--;
			}
		}

//Hacemos que el segundo plato no se repita
		for (int i = 0; i < Dia.length; i++) {
			segundo = (int) (Math.random() * 10);
			iguales2 = false;
			for (int j = 0; j < repetido2.length && !iguales2; j++) {
				if (repetido2[j] == primero) {
					iguales2 = true;
				}
			}
			if (!iguales2) {
				repetido[i] = segundo;

			} else {
				i--;
			}
		}
		
//Mostramos el menu
		for (int i = 0; i < Dia.length; i++) {
			System.out.println(Dia[i] + "\t" + primerPlato[i] + "\t" + segundoPlato[i]);
		}
	}
}