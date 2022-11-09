package Metodos;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[] numeros = new int[3];
		int[] numerosMultiplicados = new int[3];

		char opc;
		opc = JOptionPane.showInputDialog("A: Multiplicar x2\nB:\nC:\nD:\nE:\nF:\nG:\nH:\nI:\nJ:\nK: Salir")
				.toUpperCase().charAt(0);

		do {
			switch (opc) {
			case 'A':
				Multiplicar(numeros, numerosMultiplicados);
				break;
			case 'B':

				break;
			case 'C':

				break;
			case 'D':

				break;
			case 'E':

				break;
			case 'F':

				break;
			case 'G':

				break;
			case 'H':

				break;
			case 'I':

				break;
			case 'J':

				break;
			case 'K':
				JOptionPane.showMessageDialog(null, "Has decidido salir");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Introduce una opcion valida", "ERROR", JOptionPane.ERROR_MESSAGE);
				break;

			}
		} while (opc != 'K');

	}

	private static void Multiplicar(int[] numeros, int[] numerosMultiplicados) {
		int numero;
		
		for (int i = 0; i < numeros.length; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el " + (i+1) + "º numero entre el 1 al 500:"));
			if (numero >= 1 && numero <= 500) {
				numeros[i] = numero;
				numerosMultiplicados[i] = numero * 2;
			}else {
				i--;
				JOptionPane.showMessageDialog(null, "Introduce un numero valido","ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		for (int i : numeros) {
			JOptionPane.showMessageDialog(null,"El numero es: " + i + " y multiplicado por dos es: " + i);
		}
		

	}

}
