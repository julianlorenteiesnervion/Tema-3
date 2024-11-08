package boletinarrays;

import java.util.*;

public class Ejer8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random random = new Random();
		
		// Array con 100 posiciones
		int nums[] = new int[100];
		
		// Variable para guardar el número introducido por el user
		int numInput;
		
		/* For para generar números aleatorios entre 1 y 10 para
		cada posición del array */
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(1, 11);
		}
		
		System.out.print("Introduce un número: ");
		numInput = reader.nextInt();
		
		/* Por cada vuelta, comprobamos si el
		 * número introducido es igual al número
		 * que toca. Si lo es, imprimimos su posición */
		for (int i = 0; i < nums.length; i++) {
			if (numInput == nums[i])
				System.out.print(i + " ");
		}
		
		reader.close();
	}

}
