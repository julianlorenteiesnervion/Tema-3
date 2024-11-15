package boletinarrays3;

import java.util.*;

public class Ejer3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		int filas;
		int columnas;
		
		// Recogemos el número de filas y de columnas
		System.out.print("Introduce el número de filas: ");
		filas = reader.nextInt();
		
		System.out.print("Introduce el número de columnas: ");
		columnas = reader.nextInt();
		
		// Creamos un array bidimensional
		int[][] tabla = new int[filas][columnas];
		
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
