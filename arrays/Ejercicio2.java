package arrays;

public class Ejercicio2 {

	public static void main(String[] args){
		int Numeros[] = new int[10];
	
		for (int i = 0; i < Numeros.length; i++) {
			Numeros[i] = (int) ((Math.random()*100)-50);
			if(Numeros[i] > 0){
				System.out.println("La raiz cuadrada de " + Numeros[i] + " es: " + (float)Math.sqrt(Numeros[i]));
			}
			else {
				System.out.println("El nº: " + Numeros[i] + " no tiene raiz cuadrada");
			}
			
	}
	}

}
