package DNI;

import javax.swing.JOptionPane;

public class DNI2_JOptionPane {

	public static void main(String[] args) {

		String Letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		String DNIconLetra;
		int DNIsinLetra;
		int resto;
		int Digitos = 0;
		Boolean LetraFinal = false;
		Boolean Terminado = false;
		int continuar = 1;

		do {
			continuar = 0;
			DNIsinLetra = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu DNI (sin letra)"));
			resto = DNIsinLetra % 23;

			if (Integer.toString(DNIsinLetra).length() == 8) {
				JOptionPane.showMessageDialog(null, ("Tu DNI con letra es: " + DNIsinLetra + Letras.charAt(resto)));
				Terminado = true;
				continuar = JOptionPane.showConfirmDialog(null, "¿Quieres continuar introduciendo DNIs?");
			} else {
				JOptionPane.showMessageDialog(null, "El formato del DNI es erroneo!", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			}
		} while (!Terminado || continuar != 1);

		do {
			Terminado = false;
			continuar = 0;
			Digitos = 0;

			DNIconLetra = JOptionPane.showInputDialog("Introduce tu DNI (con letra)").toUpperCase();
			if (DNIconLetra.length() != 9) {
				JOptionPane.showMessageDialog(null, "El formato del DNI es erroneo", "ERROR",
						JOptionPane.ERROR_MESSAGE);
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
						JOptionPane.showMessageDialog(null, "El DNI que has introducido es correcto");
					} else {
						JOptionPane.showMessageDialog(null, "El DNI es incorrecto tu letra es: " + Letras.charAt(resto),
								"Entrada", JOptionPane.WARNING_MESSAGE);
					}

					Terminado = true;
					continuar = JOptionPane.showConfirmDialog(null, "¿Quieres continuar introduciendo DNIs?");
				} else {
					JOptionPane.showMessageDialog(null, "El formato del DNI es erroneo!", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
			}

		} while (!Terminado || continuar != 1);

		do {
			Terminado = false;
			Digitos = 0;
			continuar = 0;

			DNIconLetra = JOptionPane.showInputDialog("Introduce tu DNI o NIE").toUpperCase();
			if (DNIconLetra.length() != 9) {
				JOptionPane.showMessageDialog(null, "El formato del DNI es erroneo", "ERROR", JOptionPane.ERROR_MESSAGE);
			} else {

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
						JOptionPane.showMessageDialog(null, "El DNI que has introducido es correcto", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "El DNI es incorrecto tu letra es: " + Letras.charAt(resto),
								"ERROR", JOptionPane.WARNING_MESSAGE);
					}

					Terminado = true;
					continuar = JOptionPane.showConfirmDialog(null, "¿Quieres continuar introduciendo DNIs?");
				} else {
					JOptionPane.showMessageDialog(null, "El formato del DNI es erroneo!", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		} while (!Terminado || continuar != 1);
	}
}
