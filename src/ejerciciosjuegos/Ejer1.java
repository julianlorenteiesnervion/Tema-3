package ejerciciosjuegos;

public class Ejer1 {
	
	/* Función para buscar el valor en la tabla.
	 * Recibe como entrada la tabla y el valor a buscar */
	static boolean valueSearch(int table[][], int value) {
		/* Booleana para que en caso de encontrar el valor se
		 * convierta en true */
		boolean found = false;
		
		// For para las filas
		for (int j = 0; j < table.length; j++) {
			// For para las columnas
			for (int i = 0; i < table[j].length; i++) {
				// Si encontramos el valor, found será true
				if (table[j][i] == value)
					found = true;
			}
		}
		
		// Devolvemos el balor de la booleana
		return found;
	}

	public static void main(String[] args) {
		// Creamos una tabla bidimensional con varios valores
		int[][] table = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		// Valor a buscar
		int value = 2;
		
		// Imprimimos por pantalla el resultado de la función
		System.out.print(valueSearch(table, value));
	}

}
