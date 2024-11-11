package boletinarrays2;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner reader = new Scanner(System.in);
		
		int num;
		
		int count = 0;
		
		int array[] = new int[1000];
	
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(0, 100);
		}
		
		Arrays.sort(array);
		
		System.out.print("Introduce un número: ");
		num = reader.nextInt();
		
		for (int i = 0; i <= num; i++) {
			if (array[i] == num)
				count++;
		}
		
		System.out.print("El número " + num + " se ha encontrado"
				+ " " + count + " veces en este array.");
		
		reader.close();

	}

}
