package boletinarrays3;

import java.util.*;

public class Ejer3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Nº de filas y columnas que introducirá el usuario
		int filas;
		int columnas;
		
		// Declaración del array
		int[][] tabla;
		
		// Recogemos el número de filas y de columnas
		System.out.print("Introduce el número de filas: ");
		filas = reader.nextInt();
		
		System.out.print("Introduce el número de columnas: ");
		columnas = reader.nextInt();
		
		/* Array bidimensional con las filas
		 * y columnas que introdujo el usuario */
		tabla = new int[filas][columnas];
		
		// For para las filas
		for (int j = 0; j < filas; j++) {
			// For para las columnas
			for (int i = 0; i < columnas; i++) {
				tabla[j][i] = 10 * j + i; // Operación
				System.out.print(tabla[j][i] + "\t");
			}
		System.out.println(); // Salto de línea
		}
		
		reader.close();
	}

}
