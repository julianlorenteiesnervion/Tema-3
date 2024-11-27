package boletinfuncionesbidimensionales;

public class Ejer3 {
	
	// Función para calcular sin un array es simétrico diagonalmente
	static boolean symmetricArray(int[][] table) {
		// Inicializamos la booleana para guardar en ella si es simétrica o no
		boolean symmetric = true;
		
		// For para ir calculando si la celda [i][j] es igual a la celda [j][i]
		for (int j = 0; j < table.length && symmetric; j++) {
			for (int i = j; i < table.length && symmetric; i++) {
				/* Si no son iguales, la tabla no será simétrica nunca más
				 * y terminará el bucle */
				if (table[i][j] != table[j][i])
					symmetric = false;
			}
		}
		
		// Devolvemos la booleana
		return symmetric;
	}

	public static void main(String[] args) {
		// Creamos una tabla bidimensional
		int[][] table = new int[][] {
			{1, 2, 3, 4},
			{2, 5, 6, 7},
			{3, 6, 5, 8},
			{4, 7, 8, 10}
		};
		
		// Ternaria para imprimir si la tabla es simétrica o no
		System.out.print("La tabla " + (symmetricArray(table) == true ? "es " : "no es ") + "simétrica.");
		
		}
	}