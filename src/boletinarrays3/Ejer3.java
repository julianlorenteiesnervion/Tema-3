package boletinarrays3;

import java.util.*;

public class Ejer3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int filas;
		int columnas;
		
		System.out.print("Introduce el número de filas: ");
		filas = reader.nextInt();
		
		System.out.print("Introduce el número de columnas: ");
		columnas = reader.nextInt();
		
		int[][] tabla = new int[filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				tabla[j][i] = 10 * i + j;
				System.out.print(tabla[j][i] + "\t");
			}
		System.out.println();
		}
		
		reader.close();
	}

}
