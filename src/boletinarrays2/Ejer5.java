package boletinarrays2;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner reader = new Scanner(System.in);
		
		// Variable para guardar el número que introduce el usuario
		int num;
		
		/* Contador para guardar las veces que se ha encontrado
		ese número en el array */
		int count = 0;
		
		// Creación del array con 1000 posiciones
		int array[] = new int[1000];
	
		// For para generar los números aleatorios en el array
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(0, 100);
		}
		
		// Ordenamos el array
		Arrays.sort(array);
		
		// Le pedimos el número al usuario
		System.out.print("Introduce un número: ");
		num = reader.nextInt();
		
		/* For para comprobar si el número que toca es igual
		al número introducido por el usuario. Si lo es, incrementamos
		la variable "count" */
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num)
				count++;
		}
		
		// Imprimimos por pantalla al usuario el contador
		System.out.print("El número " + num + " se ha encontrado"
				+ " " + count + " veces en este array.");
		
		reader.close();

	}

}
