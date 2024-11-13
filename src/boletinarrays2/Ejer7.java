package boletinarrays2;

import java.util.*;

public class Ejer7 {

	public static void main(String[] args) {
		// Creamos una tabla con 55 posiciones
		int[] array = new int[55];
		
		/* Variable para guardar el inicio y
		 * fin del rango donde guardaremos el
		 * valor en el array */
		int inicioFin = 0;
		
		// For que se repite 10 veces
		for (int i = 1; i <= 10; i++) {
			/* Lo guardamos en array
			 * Empezamos en inicioFin
			 * Terminamos en inicioFin + i
			 * Lo rellenamos con i */
			Arrays.fill(array, inicioFin, inicioFin+i, i);
			inicioFin += i;
		}
		
		System.out.println(Arrays.toString(array));
	}

}
