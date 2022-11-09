package arrays;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Numeros[] = new int[20];
		int igual = 0;
		
		System.out.print("Introduce un numero: ");
			int num = sc.nextInt();
			
		for (int i = 0; i < Numeros.length; i++) {
			Numeros[i] = (int) (Math.random()*20 + 1);
			if(num == Numeros[i]) {
				igual++;
			}
		}
		System.out.println("Tu numero ha aparecido " + igual + " veces");
	sc.close();
	}

}
