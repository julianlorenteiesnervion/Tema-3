package boletinarrays;

import java.util.*;

public class Ejer1 {

	public static void main(String[] args) {
		// Creamos el random
		Random random = new Random();
		
		// Creamos una variable numbers con una tabla de capacidad 10
		int numbers[] = new int[10];
		
		/* For en el que sumaremos +1 a i por cada vuelta hasta que se haya dado
		 * tantas vueltas como longitud de la tabla del array de numbers */
		for (int i = 0; i < numbers.length; i++) {
			// Generamos un número aleatorio en la posición de la tabla que toque
			numbers[i] = random.nextInt(1, 101);
			// Imprimimos esa posición de la tabla con el número aleatorio
			System.out.print(numbers[i] + " ");
		}

	}

}
