package boletinarrays2;

import java.util.*;

public class Ejer1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Variables para guardar el tamaño y valor
		int tamano;
		int valor;
		
		/* Le preguntamos al usuario por el tamaño de la tabla y
		 * el valor a guardar en todas las posiciones */
		System.out.print("Introduce un tamaño: ");
		tamano = reader.nextInt();
		
		System.out.print("Introduce un valor: ");
		valor = reader.nextInt();
		
		// Creamos el array con el tamaño indicado por el usuario
		int array[] = new int[tamano];
		
		// Fill para la tabla "array" la cual rellenaremos con "valor"
		Arrays.fill(array, valor);;
		
		// Imprimimos por pantalla la tabla con "Arrays.toString(nombreArray)"
		System.out.print(Arrays.toString(array));
		
		reader.close();

	}

}
