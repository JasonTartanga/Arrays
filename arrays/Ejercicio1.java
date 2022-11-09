package arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		int Numeros[] = new int[10];
		
		for (int i = 0; i < Numeros.length; i++) {
			Numeros[i] = (int) ((Math.random()*100)-50);
			System.out.println(Numeros[i]);
		}

	}

}
