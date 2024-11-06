package boletinarrays;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Variable num con una tabla de 10 posiciones
		int num[] = new int[10];
		
		// Variable para guardar la suma de todos los números introducidos por el usuario
		int sumaNums = 0;
		
		// For que se repetirá tantas veces como posiciones hay en la tabla (10)
		for (int i = 0; i < num.length; i++) {
			// Le pedimos un número y lo guardamos en la posición correspondiente
			System.out.print("Introduce un número: ");
			num[i] = reader.nextInt();
		}
		
		/* Declaración de las variables min y max para guardar el número más pequeño y el más grande
		 * ¿Por qué las declaro aquí y no al principio?
		 * Porque necesitamos asignarle por ejemplo el primer valor introducido por el usuario como
		 * en este caso, ya que, si le asignamos 0 al número mínimo y el usuario introduce como
		 * número más pequeño un 2, el número más pequeño guardado en min al final del programa
		 * será el 0, no el 2. Lo mismo con max */
		int min = num[0];
		int max = num[0];
		
		// For que se repetirá tantas veces como posiciones hay en la tabla (10)
		for (int i = 0; i < num.length; i++) {
			/* Si el número de la posición en la que estamos es más pequeño
			 * que el número más pequeño guardado, actualizamos el valor de la
			 * variable min para que el número de la posición en la que estamos sea
			 * el nuevo número más pequeño */
			if (num[i] < min)
				min = num[i];
			
			/* Si el número de la posición en la que estamos es más grande
			 * que el número más grande guardado, actualizamos el valor de la
			 * variable max para que el número de la posición en la que estamos sea
			 * el nuevo número más grande */
			if (num[i] > max)
				max = num[i];
			
			// Por cada vuelta, actualizamos esta variable para guardar la suma total de todos los números
			sumaNums += num[i];
		}
		
		// Mensaje final
		System.out.print("Suma de todos los números = " + sumaNums + "\n"
				+ "Número más pequeño = " + min + "\n"
						+ "Número más grande = " + max);
		
		reader.close();
	}

}
