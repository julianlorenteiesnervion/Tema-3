package boletinarrays3;

import java.util.Arrays;

public class Ejer4 {

	public static void main(String[] args) {
		// Creamos una tabla bidimensional de 10x10
		int[][] tabla = new int[10][10];
		
		// Filas
		for (int i = 0; i < tabla.length; i++) {
			// Columnas
			for (int j = 0; j < tabla[i].length; j++) {
				/* Multiplicamos las dos posiciones X e Y
				 * (ambas sumadas anteriormente por 1 ya que
				 * no queremos 0x0) */
				tabla[i][j] = (j+1) * (i+1);
				// Imprimimos la posición
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println(); // Salto de línea
		}
	}
}
