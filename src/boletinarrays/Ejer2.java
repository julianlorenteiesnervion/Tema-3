package boletinarrays;

import java.util.*;

public class Ejer2 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de la variable nums para guardar los números introducidos por el usuario
		double nums[] = new double[5];
		
		/* Bucle for que se ejecutará mientras i sea menor que la longitud de la
		 * tabla del array de la variable nums */
		for (int i = 0; i < nums.length; i++) {
			// Le pedimos un número decimal al usuario
			System.out.print("Introduce un número decimal: ");
			// Lo guardamos en la posición i de la tabla de nums
			nums[i] = reader.nextDouble();
		}
		
		// For exactamente igual que el anterior
		for (int i = 0; i < nums.length; i++) {
			// Imprimimos el número de la posición i de la tabla de nums
			System.out.print(nums[i] + " ");
		}
		
		reader.close();

	}

}
