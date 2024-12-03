package ejerciciosjuegos;

import java.util.Arrays;
import java.util.Random;

public class Ejer3 {
	
	// Función para desordenar la tabla
	static int[][] randomTable(int[][] table) {
		Random random = new Random();
		
		/* Hacemos una copia de la tabla recibida y nos la guardamos
		 * en una variable por separado. El objetivo de esto es que,
		 * una vez hayamos desordenado la tabla, comprobemos si la tabla
		 * modificada es igual a la original para que en caso de que sí
		 * que sean iguales se vuelva a repetir el for que desordena la tabla */
		int[][] originalTable = new int [table.length][table[0].length];
		
		for (int j = 0; j < table.length; j++) {
			for (int i = 0; i < table.length; i++) {
				originalTable[j][i] = table[j][i];
			}
		}
		
		// Variable auxiliar para guardar en ella el valor de la otra posición
		int aux;
		
		// Variables para la posición aleatoria
		int pos1;
		int pos2;
		
		// Do-while para que la tabla se desordene siempre
		do {
			// For para desordenar la tabla
			for (int j = 0; j < table.length; j++) {
				for (int i = 0; i < table[j].length; i++) {
					// Posición aleatoria (fila y columna)
					pos1 = random.nextInt(0, table.length);
					pos2 = random.nextInt(0, table[j].length);
					
					// Intercambio de valores
					aux = table[j][i];
					table[j][i] = table[pos1][pos2];
					table[pos1][pos2] = aux;
				}
			}
		} while (Arrays.equals(table, originalTable));
		
		return table; // Devolvemos la tabla
	}

	public static void main(String[] args) {
		// Tabla que se desordenará
		int[][] table = new int[][] {{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};
		
		// Utilizamos la función para desordenarla
		randomTable(table);
		
		// Imprimimos la tabla
		for (int j = 0; j < table.length; j++) {
			for (int i = 0; i < table.length; i++) {
				System.out.print(table[j][i] + "\t");
			}
			System.out.println();
		}
	}

}