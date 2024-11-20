package boletinfunciones;

import java.util.Arrays;

public class Ejer5 {

	/* Función estática entera que devolverá un array.
	 * La función se llama "buscarTodos" y recibirá dos datos
	 * de entrada: una tabla y un valor a buscar en ella */
	static int[] buscarTodos(int t[], int valor) {
		// Inicializamos un contador a 0
		int count = 0;
		
		/* Recorremos la tabla que recibimos como entrada
		 * y en caso de encontrar el valor que buscamos, incrementamos
		 * el contador que hemos creado anteriormente */
		for (int value : t) {
			if (value == valor)
				count++;
		}
		
		/* Creamos una tabla para guardar los índices,
		 * que será tan larga como veces haya sido
		 * encontrado el valor en la tabla recibida */
		int[] indices = new int[count];
		
		/* Restablecemos el contador a 0, ya que ahora
		 * lo vamos a usar para controlar las posiciones
		 * de la tabla de los índices */
		count = 0;
		
		// For que recorrerá toda la tabla recibida
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				indices[count] = i;
				count++;
			}
		}
		
		return indices;
	}

	public static void main(String[] args) {
		
		int[] table = new int[] {2, 3, 4, 5};
		
		System.out.print(Arrays.toString(buscarTodos(table, 3)));
		
	}

}
