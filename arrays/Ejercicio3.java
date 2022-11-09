package arrays;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Numeros[] = new int[5];
		
		for (int i = 0; i < Numeros.length; i++) {
		
			System.out.print("Introduce un numero PAR: ");
			int num = sc.nextInt();
				if(num % 2 == 0) {
					Numeros[i] = num;
				}
				else {
					System.out.println(num + " es IMPAR");
					i--;
				}
			
		}
		int temp;
		 for (int i = 1; i < Numeros.length; i++) {
	           for (int k = Numeros.length - 1; k >= i; k--) {
	               if(Numeros[k] < Numeros[k-1]){
	                   temp = Numeros[k];
	                   Numeros[k] = Numeros[k-1];
	                   Numeros[k-1]=  temp;
	               }
	           }
	       }
		 for (int i = 0; i < Numeros.length; i++) {
			System.out.println(Numeros[i]);
		}
		sc.close();
	}

}
