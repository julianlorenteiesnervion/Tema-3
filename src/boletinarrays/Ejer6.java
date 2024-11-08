package boletinarrays;

import java.util.*;

public class Ejer6 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Array nums con 8 posiciones
		int nums[] = new int[8];
		
		// For para pedir los 8 números
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Introduce un número: ");
			nums[i] = reader.nextInt();
		}
		
		/* For each para imprimir por cada vuelta el valor
		 * correspondiente a la posición que toque de la tabla
		 * e imprimir si es par o impar */
		for (int value : nums) {
			System.out.println(value + (value % 2 == 0 ? " par" : " impar"));
		}
		
		reader.close();

	}

}
