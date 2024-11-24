package boletinfuncionesbidimensionales;

public class Ejer5 {
	
	// Creamos la función "gira90", que recibirá una tabla de entrada
	static int[][] gira90(int tablaInicio[][]) {
		// Creamos la variable para devolver luego la tabla rotada
		int[][] tabla90 = new int[tablaInicio.length][tablaInicio[0].length];
		
		// For para las columnas
		for (int i = 0; i < tablaInicio.length; i++) {
			// For para las filas
        	for (int j = 0; j < tablaInicio.length; j++) {
        		tabla90[j][tablaInicio.length - i - 1] = tablaInicio[i][j];
        	}
        }
		
		// Devolvemos la tabla rotada
		return tabla90;
	}

	public static void main(String[] args) {
		// Creamos una tabla
		int[][] array = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		
		// Creamos una tabla en la que usaremos la función para rotar la tabla que creamos antes
		int [][] array90 = gira90(array);
				
		// For para las filas
		for (int j = 0; j < array90.length; j++) {
			// For para las columnas
			for (int i = 0; i < array90[j].length; i++) {
				// Imprimimos el valor correspondiente con un tabulador
				System.out.print(array90[j][i] + "\t");
			}
		// Salto de línea
		System.out.println();
		}

	}

}
