package arrays;

import javax.swing.JOptionPane;

public class Ejercicio13_JOptionPane {

	public static void main(String[] args) {

// Scanner, Arrays y variables
		String[] Nombre = new String[5];
		int[] Nota = new int[5];

		int opc = 0;
		int Nota1;
		int Num = 0;
		String continuar;
		int mejorAlumno = 0;
		String Alumno;
		Boolean hayAlumno = false;
		Boolean notaValida = false;

// Preguntamos nombres y notas
		for (int i = 0; i < Nombre.length; i++) {
			Nombre[i] = JOptionPane.showInputDialog("Introduce el " + (i + 1) + " nombre");

			do {
				Nota1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota de " + Nombre[i]));
				notaValida = true;
				if (Nota1 >= 0 && Nota1 <= 10) {
					Nota[i] = Nota1;
				} else {
					JOptionPane.showMessageDialog(null, "Introduce una nota valida: ");
					notaValida = false;
				}
			} while (!notaValida);
		}
		do {

// Menu
			opc = Integer.parseInt(JOptionPane.showInputDialog("1. Visualizar nombres y sus notas\n"
					+ "2. Visualizar sólo el nombre de la persona con mayor nota\n"
					+ "3. Visualizar la media de las notas\n"
					+ "4. Visualizar el número de veces que aparece una nota\n"
					+ "5. Mostrar notras de un alumno especifico\n" + "6. Introducir nuevas notas a quien queramos\n"
					+ "7. Clasificar de mayor a menor\n" + "8. Salir\n"));

			switch (opc) {

// Mostramos la nota de cada estudiante
			case 1:
				for (int i = 0; i < Nombre.length; i++) {
					JOptionPane.showMessageDialog(null, "La nota de " + Nombre[i] + " es: " + Nota[i]);
				}
				break;

// Mostramos unicamente la nota mas alta
			case 2:
				int Mayor = 0;

				for (int i = 0; i < Nombre.length; i++) {
					if (Nota[i] > Mayor) {
						Mayor = Nota[i];
						mejorAlumno = i;
					}
				}
				JOptionPane.showMessageDialog(null,
						("El que tiene la nota mas alta es " + Nombre[mejorAlumno] + " : " + Mayor));
				break;

// Mostramo la media
			case 3:
				int Media = 0;

				for (int i = 0; i < Nombre.length; i++) {
					Media += Nota[i];
				}
				JOptionPane.showMessageDialog(null, ("La nota media es: " + (float) Media / Nombre.length));
				break;

//Mostrar cantidad de veces que aparece X numero
			case 4:
				int contador = 0;

				Num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
				for (int i = 0; i < Nombre.length; i++) {
					if (Nota[i] == Num) {
						contador++;
					}
				}
				JOptionPane.showMessageDialog(null, ("El numero " + Num + " ha aparecido " + contador + " veces"));
				break;

//Darnos la nota de un alumno
			case 5:

				Alumno = JOptionPane.showInputDialog("Introduce el nombre de un alumno: ");
				for (int i = 0; i < Nombre.length; i++) {
					if (Nombre[i].contains(Alumno)) {
						JOptionPane.showMessageDialog(null, (Alumno + " ha sacado un " + Nota[i]));
						hayAlumno = true;
					}
				}
				if (!hayAlumno) {
					JOptionPane.showMessageDialog(null, ("No hay ningun alumno con ese nombre"));
				}
				break;

//Cambiar nota
			case 6:

				for (int i = 0; i < Nombre.length; i++) {
					continuar = JOptionPane.showInputDialog("Quieres cambiar la nota de " + Nombre[i] + " (S,N)");
					if (continuar.charAt(0) == 'S') {
						do {
							Nota1 = Integer
									.parseInt(JOptionPane.showInputDialog("Introduce la nueva nota de " + Nombre[i]));
							notaValida = true;
							if (Nota1 >= 0 && Nota1 <= 10) {
								Nota[i] = Nota1;
							} else {
								JOptionPane.showMessageDialog(null, ("Introduce una nota valida"));
								;
								notaValida = false;
							}
						} while (!notaValida);
					}
				}
				break;

//Ordenar de mayor a menor
			case 7:
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
					JOptionPane.showMessageDialog(null, (i + 1) + "º " + Nombre[i] + " : " + Nota[i]);
				}
				break;

			case 8:
				break;

			default:
				JOptionPane.showMessageDialog(null, "Introduce una opcion valida");
				break;
			}
		} while (opc != 8);
		JOptionPane.showMessageDialog(null, "Has decidido no contiuar");
	}

}