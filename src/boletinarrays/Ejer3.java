package boletinarrays;

import java.util.*;

public class Ejer3 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		/* Variable array nums para guardar los números
		introducidos por el usuario (tabla de 10 de longitud) */
		int nums[] = new int[10];
		
		/* For en el que iniciamos i en 0 y se repetirá mientras i sea menor
		 * que la longitud de la tabla de nums (teniendo en cuenta que sumamos
		 * +1 por cada vuelta a i) */
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Introduce un número: "); // Solicitamos el número
			// Guardamos el número en la posición i (ya que sube de posición por cada vuelta)
			nums[i] = reader.nextInt();
		}
		
		/* For para mostrar los números introducidos en orden inverso.
		 * Para ello, inicializamos la i con el valor de la longitud de la tabla menos 1,
		 * ya que la tabla tiene 10 posiciones pero la posición más alta es la 9, no la 10.
		 * Se repetirá mientras i sea mayor o igual que 0, y restaremos un -1 a i por
		 * cada vuelta */
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i] + " "); // Imprimimos el número
		}
		
		reader.close();

	}

}
