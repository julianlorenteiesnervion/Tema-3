package boletinfunciones;

import java.util.Arrays;

public class Ejer5 {

	/* Función estática entera que devolverá un array.
	 * La función se llama "buscarTodos" y recibirá dos datos
	 * de entrada: una tabla y un valor a buscar en ella */
	static int[] buscarTodos(int t[], int valor) {
		// Inicializamos un contador a 0
		int count = 0;
		
		/* Creamos una tabla para guardar los índices,
		 * que será tan larga como veces haya sido
		 * encontrado el valor en la tabla recibida */
		int[] indices = new int[longitud(t, valor)];
		
		// For que recorrerá toda la tabla recibida
		for (int i = 0; i < t.length; i++) {
			/* Si el valor correspondiente es el mismo que el valor recibido,
			 * añadimos esa posición a la tabla de índices */
			if (t[i] == valor) {
				indices[count] = i;
				// Incremento del contador de posiciones de la tabla indices
				count++;
			}
		}
		
		// Devolvemos la tabla
		return indices;
	}
	
	static int longitud(int t[], int valor) {
		// Inicializamos un contador a 0
		int count = 0;
		
		/* Recorremos la tabla que recibimos como entrada
		 * y en caso de encontrar el valor que buscamos, incrementamos
		 * el contador que hemos creado anteriormente */
		for (int value : t) {
			if (value == valor) {
				count++;
			}
		}
		
		// Devolvemos el contador
		return count;
	}

	public static void main(String[] args) {
		
		// Tabla con números
		int[] table = new int[] {2, 3, 4, 5, 6};
		
		// Imprimimos la tabla de los índices
		System.out.print(Arrays.toString(buscarTodos(table, 3)));
		
	}

}
