package arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int[] arrayA = new int[10];
		int[] arrayB = new int[10];
		int[] arrayC = new int[20];

		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = (int) (Math.random()*100);
			arrayB[i] = (int) (Math.random()*100);
		}
		for (int i = 0; i < arrayC.length; i++) {
			if(i < 10) {
				arrayC[i] = arrayA[i];
			}
			else {
				arrayC[i] = arrayB[i-10];
			}
		System.out.print(arrayC[i] + (i==(arrayC.length-1)?" ":" --> "));
		}
	}

}
