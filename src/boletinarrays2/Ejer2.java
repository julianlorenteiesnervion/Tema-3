package boletinarrays2;

import java.util.*;

public class Ejer2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Creamos los dos arrays con 10 posiciones cada uno
		int array1[] = new int[10];
		int array2[] = new int[10];
		
		// Variable para guardar el valor que le pedimos al usuario
		int value;
		
		// For que se repetirá 20 veces (10 para el primer array y 10 para el segundo)
		for (int i = 0; i < (array1.length + array2.length); i++) {
			System.out.print("Introduce un valor: ");
			value = reader.nextInt();
			
			/* Si i vale menos que 10, lo guardamos en el primer array,
			si no, en el segundo array */
			if (i < 10)
				array1[i] = value;
			else
				array2[i - 10] = value;
		}
		
		System.out.print("Los arrays " + (Arrays.equals(array1, array2) ? "son " : "no son ") + "iguales.");
		
		reader.close();

	}

}
