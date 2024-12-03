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
		
		// Variables para generar dos posiciones aleatorias en ellas por cada vuelta
		int pos1;
		int pos2;
		
		// Variable auxiliar para guardar en ella el valor de la segunda posición
		int aux;
		
		// Do-while para que la tabla se desordene siempre
		do {
			// For para desordenar la tabla
			for (int i = 0; i < table.length; i++) {
				// Generamos las posiciones aleatorias
				pos1 = random.nextInt(0, table.length);
				pos2 = random.nextInt(0, table.length);
				
				// Nos guardamos el valor de la pos2 en la variable auxiliar
				aux = table[pos2][pos1];
				
				// Hacemos el intercambio de valores
				table[pos2][pos1] = table[pos1][pos2];
				table[pos1][pos2] = aux;
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