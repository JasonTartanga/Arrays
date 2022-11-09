package DNI;

import java.util.Scanner;

public class DNI2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String Letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		String DNIconLetra;
		int DNIsinLetra;
		int resto;
		int Digitos = 0;
		Boolean LetraFinal = false;
		Boolean Terminado = false;

		do {
			System.out.print("Introduce tu DNI (sin letra): ");
			DNIsinLetra = sc.nextInt();
			resto = DNIsinLetra % 23;

			if (Integer.toString(DNIsinLetra).length() == 8) {
				System.out.println("Tu DNI con letra es: " + DNIsinLetra + Letras.charAt(resto));
				Terminado = true;
			} else {
				System.out.println("El formato del DNI es erroneo!");
			}

		} while (!Terminado);

		System.out.println();
		do {
			Terminado = false;

			System.out.print("Introduce tu DNI (con letra): ");
			DNIconLetra = sc.next().toUpperCase();

			if (DNIconLetra.length() != 9) {
				System.out.println("El formato del DNI es erroneo");
			} else {
				for (int i = 0; i < DNIconLetra.length() - 1; i++) {
					if (Character.isDigit(DNIconLetra.charAt(i))) {
						Digitos++;
					}
				}
				if (!Character.isDigit(DNIconLetra.charAt(8))) {
					LetraFinal = true;
				}
				if (Digitos == 8 && LetraFinal) {
					resto = Integer.parseInt(DNIconLetra.substring(0, 8)) % 23;

					if (DNIconLetra.charAt(8) == Letras.charAt(resto)) {
						System.out.println("El DNI que has introducido es correcto");
					} else {
						System.out.println("El DNI es incorrecto tu letra es: " + Letras.charAt(resto));
					}

					Terminado = true;
				} else {
					System.out.println("El formato del DNI es erroneo!");
				}
			}
		} while (!Terminado);

		System.out.println();
		do {
			Terminado = false;
			Digitos = 0;
			
			System.out.print("Introduce tu DNI o NIE: ");
			DNIconLetra = sc.next().toUpperCase();

			if (!Character.isDigit(DNIconLetra.charAt(0))) {
				
				switch (DNIconLetra.charAt(0)) {
				case 'X':
					DNIconLetra = 0 + DNIconLetra.substring(1, 9);
					break;
				case 'Y':
					DNIconLetra = 1 + DNIconLetra.substring(1, 9);
					break;
				case 'Z':
					DNIconLetra = 2 + DNIconLetra.substring(1, 9);
					break;
				}

			}
			if (DNIconLetra.length() != 9) {
				System.out.println("El formato del DNI es erroneo");
			} else {
				for (int i = 0; i < DNIconLetra.length() - 1; i++) {
					if (Character.isDigit(DNIconLetra.charAt(i))) {
						Digitos++;
					}
				}
				if (!Character.isDigit(DNIconLetra.charAt(8))) {
					LetraFinal = true;
				}
				if (Digitos == 8 && LetraFinal) {
					resto = Integer.parseInt(DNIconLetra.substring(0, 8)) % 23;

					if (DNIconLetra.charAt(8) == Letras.charAt(resto)) {
						System.out.println("El DNI que has introducido es correcto");
					} else {
						System.out.println("El DNI es incorrecto tu letra es: " + Letras.charAt(resto));
					}

					Terminado = true;
				} else {
					System.out.println("El formato del DNI es erroneo!");
				}
			}

		} while (!Terminado);
		sc.close();
	}
}