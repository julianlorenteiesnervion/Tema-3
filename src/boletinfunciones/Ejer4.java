package boletinfunciones;

public class Ejer4 {
	/* Función estática entera llamada "buscar" en la
	 * que recibimos dos datos de entrada (la tabla
	 * y el valor a buscar) */
	static int buscar(int t[], int clave) {
		/* Variable que usamos para actualizarla
		 * con la posición si se ha encontrado. Si no,
		 * se mantendrá en -1 */
		int found = -1;
		// Variable para la posición de la tabla
		int pos = 0;
		
		/* Mientras found siga siendo -1
		 * (no se ha encontrado el valor) y
		 * sigamos buscando dentro de la tabla... */
		while (found == -1 && pos < t.length) {
			/* Si el valor de la posición correspondiente es
			 * igual a la clave, actualizaremos la
			 * variable found con la posición */
			if (t[pos] == clave)
				found = pos;
			// Si no, pasaremos a la siguiente posición
			else
				pos++;
		}
		
		// Devolvemos el valor de found
		return found;
	}
	

	public static void main(String[] args) {
		// Tabla con los valores
		int[] table = new int[] {3, 4, 5, 6, 7};
		
		/* Print para utilizar la función e
		 * imprimir el resultado según los valores dados */
		System.out.print(buscar(table, 3));
	}

}
