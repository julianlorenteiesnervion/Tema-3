package boletinfuncionesbidimensionales;

import java.util.Arrays;
import java.util.Random;

public class Ejer1 {
	
	// Función para encontrar el mínimo y máximo
	static int[] minMax(int[][] tabla) {
		// Creamos una tabla de dos posiciones (0 min / 1 max)
		int minMax[] = new int[2];
		
		// Guardamos el primer número en el mínimo y máximo
		minMax[0] = tabla[0][0];
		minMax[1] = tabla[0][0];
		
		// For para las filas
		for (int i = 0; i < tabla.length; i++) {
			// For para las columnas
			for (int j = 0; j < tabla[i].length; j++) {
				/* Si el número que toca es más pequeño que el número mínimo,
				 * actualizamos el número mínimo */
				if (tabla[i][j] < minMax[0])
					minMax[0] = tabla[i][j];
				/* Si el número que toca es más grande que el número máximo,
				 * actualizamos el número máximo */
				else if (tabla[i][j] > minMax[1])
					minMax[1] = tabla[i][j];
			}
		}
		
		// Devolvemos la tabla con el mínimo y máximo
		return minMax;
	}

	public static void main(String[] args) {
		Random random = new Random(); // Método random (creo que su propio nombre lo dice)
		
		// Creamos una tabla de 6 filas y 10 columnas
		int[][] array = new int[6][10];
		
		// For para las filas
		for (int i = 0; i < array.length; i++) {
			// For para las columnas
			for (int j = 0; j < array[i].length; j++) {
				// Generamos un número random entre 0 y 1000 en la posición correspondiente
				array[i][j] = random.nextInt(0, 1001);
			}
		}
		
		// Imprimimos la tabla con el valor mínimo y máximo
		System.out.print(Arrays.toString(minMax(array)));
	}

}
