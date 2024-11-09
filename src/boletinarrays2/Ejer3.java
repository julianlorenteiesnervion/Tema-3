package boletinarrays2;

import java.util.*;

public class Ejer3 {

	public static void main(String[] args) {
		Random random = new Random();
		
		// Array con 30 posiciones
		int array[] = new int[30];
		
		// For que se repetirá 30 veces
		for (int i = 0; i < array.length; i++) {
			// Asignamos un número aleatorio a la posición correspondiente
			array[i] = random.nextInt(0, 10);
		}
		
		Arrays.sort(array); // Ordenamos el array
		System.out.print(Arrays.toString(array)); // Lo imprimimos
	}

}
