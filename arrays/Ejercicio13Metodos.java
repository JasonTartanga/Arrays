package arrays;

import javax.swing.JOptionPane;

public class Ejercicio13Metodos {

	public static void main(String[] args) {

		String[] nombre = new String[5];
		int[] nota = new int[5];

		int opc = 0;

		IntroducirNotas(nombre, nota);

		do {
// Menu
			opc = Integer.parseInt(JOptionPane.showInputDialog("1. Visualizar nombres y sus notas\n"
					+ "2. Visualizar sólo el nombre de la persona con mayor nota\n"
					+ "3. Visualizar la media de las notas\n"
					+ "4. Visualizar el número de veces que aparece una nota\n"
					+ "5. Mostrar notras de un alumno especifico\n" + "6. Introducir nuevas notas a quien queramos\n"
					+ "7. Clasificar de mayor a menor\n" + "8. Salir\n"));
			
//Llamamos a las funciones dependiendo de la opcion elegida
			switch (opc) {
			case 1:
				VisualizarNombresyNotas(nombre, nota);
				break;

			case 2:
				VisualizarNotaMaxima(nombre, nota);
				break;

			case 3:
				VisualizarMedia(nombre, nota);
				break;

			case 4:
				VisualizarNumeroDeNotas(nombre, nota);
				break;

			case 5:
				VisualizarNotaDeAlumno(nombre, nota);
				break;

			case 6:
				CambiarNotas(nombre, nota);
				break;

			case 7:
				OrdenarNotas(nombre, nota);
				break;

			case 8:
				JOptionPane.showMessageDialog(null, "Has decidido no continuar");
				break;
			}

		} while (opc != 8);
	}

	private static void IntroducirNotas(String[] nombre, int[] nota) {
		int notaNueva;
		boolean notaValida;

		for (int i = 0; i < nombre.length; i++) {
			nombre[i] = JOptionPane.showInputDialog("Introduce el " + (i + 1) + " nombre");

			do {
				notaNueva = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota de " + nombre[i]));
				notaValida = true;
				if (notaNueva >= 0 && notaNueva <= 10) {
					nota[i] = notaNueva;
				} else {
					JOptionPane.showMessageDialog(null, "Introduce una nota valida: ", "ERROR",
							JOptionPane.ERROR_MESSAGE);
					notaValida = false;
				}
			} while (!notaValida);
		}
	}

	private static void VisualizarNombresyNotas(String[] nombre, int[] nota) {

		for (int i = 0; i < nombre.length; i++) {
			JOptionPane.showMessageDialog(null, "La nota de " + nombre[i] + " es: " + nota[i]);
		}

	}

	private static void VisualizarNotaMaxima(String[] nombre, int[] nota) {
		int Mayor = 0;
		int mejorAlumno = 0;

		for (int i = 0; i < nombre.length; i++) {
			if (nota[i] > Mayor) {
				Mayor = nota[i];
				mejorAlumno = i;
			}
		}
		JOptionPane.showMessageDialog(null,
				("El que tiene la nota mas alta es " + nombre[mejorAlumno] + " : " + Mayor));

	}

	private static void VisualizarMedia(String[] nombre, int[] nota) {
		int Media = 0;

		for (int i = 0; i < nombre.length; i++) {
			Media += nota[i];
		}
		JOptionPane.showMessageDialog(null, ("La nota media es: " + (float) Media / nombre.length));

	}

	private static void VisualizarNumeroDeNotas(String[] nombre, int[] nota) {
		int contador = 0;
		int num;

		num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		for (int i = 0; i < nombre.length; i++) {
			if (nota[i] == num) {
				contador++;
			}
		}
		JOptionPane.showMessageDialog(null, ("El numero " + num + " ha aparecido " + contador + " veces"));

	}

	private static void VisualizarNotaDeAlumno(String[] nombre, int[] nota) {
		String Alumno;
		boolean hayAlumno = false;

		Alumno = JOptionPane.showInputDialog("Introduce el nombre de un alumno: ");
		for (int i = 0; i < nombre.length; i++) {
			if (nombre[i].contains(Alumno)) {
				JOptionPane.showMessageDialog(null, (Alumno + " ha sacado un " + nota[i]));
				hayAlumno = true;
			}
		}
		if (!hayAlumno) {
			JOptionPane.showMessageDialog(null, "No hay ningun alumno con ese nombre", "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	private static void CambiarNotas(String[] nombre, int[] nota) {
		int continuar;
		int notaNueva;
		boolean notaValida;

		for (int i = 0; i < nombre.length; i++) {
			continuar = JOptionPane.showConfirmDialog(null, "Quieres cambiar la nota de " + nombre[i] + " (S,n)");
			if (continuar == 0) {
				do {
					notaNueva = Integer
							.parseInt(JOptionPane.showInputDialog("Introduce la nueva nota de " + nombre[i]));
					notaValida = true;
					if (notaNueva >= 0 && notaNueva <= 10) {
						nota[i] = notaNueva;
					} else {
						JOptionPane.showMessageDialog(null, "Introduce una nota valida", "ERROR",
								JOptionPane.ERROR_MESSAGE);
						;
						notaValida = false;
					}
				} while (!notaValida);
			}
		}

	}

	private static void OrdenarNotas(String[] nombre, int[] nota) {
		int intercambio;
		String intercambio1;

//Bucle burbuja
		for (int i = 0; i < nota.length; i++) {
			for (int j = i + 1; j < nota.length; j++) {
				if (nota[j] > nota[i]) {

//Ordenar notas
					intercambio = nota[i];
					nota[i] = nota[j];
					nota[j] = intercambio;

//Ordenar nombres
					intercambio1 = nombre[i];
					nombre[i] = nombre[j];
					nombre[j] = intercambio1;
				}
			}
			JOptionPane.showMessageDialog(null, (i + 1) + "º " + nombre[i] + " : " + nota[i]);
		}

	}
}
