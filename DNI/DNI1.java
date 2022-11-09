package DNI;

import java.util.Scanner;

public class DNI1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu DNI (sin letra): ");
		int DNI = sc.nextInt();
		
		String Letra[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		
		int indice = DNI % 23;
		System.out.println("Tu DNI es: " + DNI + Letra[indice]);
		
		sc.close();
	}

}
