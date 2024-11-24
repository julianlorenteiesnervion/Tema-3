package boletinfuncionesbidimensionales;

public class Ejer2 {
	
	// Función para transposicionar el array (requerimos un array bidimensional como entrada)
	static int[][] transposicionarArray(int[][] tabla) {
		// Variable donde guardaremos y devolveremos el array transpuesto
		int[][] tablaTrps = new int[tabla.length][tabla[0].length];
		
		// For para las columnas
		for (int j = 0; j < tabla[0].length; j++) {
			// For para las filas
			for (int i = 0; i < tabla.length; i++) {
				tablaTrps[i][j] = tabla[j][i];
			}
		}
		
		// Devolvemos la tabla transpuesta
		return tablaTrps;
	}

	public static void main(String[] args) {
		// Creamos una tabla con los valores que queramos
		int[][] array = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		
		// Creamos una tabla en la que usaremos la función para transponer la tabla que creamos antes
		int [][] arrayTranspuesto = transposicionarArray(array);
		
		// For para las filas
		for (int j = 0; j < arrayTranspuesto.length; j++) {
			// For para las columnas
			for (int i = 0; i < arrayTranspuesto[j].length; i++) {
				// Imprimimos el valor correspondiente con un tabulador
				System.out.print(arrayTranspuesto[j][i] + "\t");
			}
			// Salto de línea
			System.out.println();
		}
		
	}

}
