package boletinfunciones;

import java.util.*;

public class Ejer3 {
	
	/* Creamos una función entera llamada "rellenaPares",
	 * la cual debe recibir como entrada dos enteros:
	 * una longitud y un fin */
	static int[] rellenaPares(int longitud, int fin) {
		// Creamos una tabla con la longitud especificada
		int[] table = new int[longitud];
		
		// Declaramos el método random
		Random random = new Random();
		
		/* For que se repetirá tantas veces como posiciones
		tiene la tabla */
		for (int i = 0; i < table.length; i++) {
			/* Generamos un número aleatorio comprendido
			 * entre 2 y el número "fin" del usuario (+1
			 * porque hay que incluirlo) */
			do {
			table[i] = random.nextInt(2, (fin + 1));
			/* Do while para que se repita la generación
			 * si el número no es par */
			} while ((table[i] % 2) != 0);
		}
		
		// Ordenamos la tabla y la devolvemos
		Arrays.sort(table);
		return table;
	}
	
	public static void main(String[] args) {
		// Definimos una longitud y fin
		int longitud = 20;
		int fin = 60;
		
		// Imprimimos la tabla aleatoria generada por la función
		System.out.print(Arrays.toString(rellenaPares(longitud, fin)));
	}

}
