package boletinarrays3;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {
		Random random = new Random();
		
		// Creamos un array de 4x5
		int[][] array = new int[4][5];
		
		/* Variables suma para guardar temporalmente la suma
		 * de la fila/columna y total para guardar el total */
		int suma = 0;
		int total = 0;
		
		// For para las filas
		for (int i = 0; i < array.length; i++) {
			suma = 0; // Restablecemos la suma temporal a 0
			// For para las columnas
			for (int j = 0; j < array[i].length; j++) {
				// Generamos un número random en la posición correspondiente
				array[i][j] = random.nextInt(100, 1000);
				// Imprimimos el número y un tabulador
				System.out.print(array[i][j] + "\t");
				
				// Actualizamos el valor de la variable suma
				suma += array[i][j];
			}
			
			// Imprimimos la suma de esa fila
			System.out.println("Σ " + suma);
			// Lo añadimos al total
			total += suma;
		}
		
		// Columnas
		for (int j = 0; j < array[0].length; j++) {
			suma = 0; // Restablecemos la suma temporal a 0
			// Recorremos las filas
			for (int i = 0; i < array.length; i++) {
				suma += array[i][j];
			}
			// Imprimimos la suma total de la columna
			System.out.print("Σ " + suma + "\t");
		}

		// Imprimimos el total de la tabla entera
		System.out.print("T: " + total);
	}

}
