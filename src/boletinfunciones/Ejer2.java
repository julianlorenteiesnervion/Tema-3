package boletinfunciones;

public class Ejer2 {
	/* Creamos una función llamada "maximo" que será de tipo entera.
	 * Necesitaremos una tabla (array) de entrada. */
	static int maximo(int t[]) {
		/* Inicializamos el valor máximo al primer valor de la tabla
		 * (Creo que no hace falta que vuelva a explicar por qué hago esto,
		 * siempre es lo mismo en este caso) */
		int max = t[0];
		
		/* For each para recorrer toda la tabla y, en el caso
		 * de que sea mayor que el máximo, se convertirá en el
		 * nuevo número máximo */
		for (int value : t) {
			if (value > max)
				max = value;
		}
		
		// Devolvemos el número máximo
		return max;
	}
	
	public static void main(String[] args) {
		// Creamos una tabla con algunos valores
		int[] tabla = new int[] {3, 5, 1};
		
		// Imprimimos el número más grande gracias a la función
		System.out.print(maximo(tabla));

	}

}
