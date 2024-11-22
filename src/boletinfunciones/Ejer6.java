package boletinfunciones;

import java.util.Arrays;

public class Ejer6 {
	
	/* Creamos una función estática entera llamada "suma", que debe
	 * recibir como entrada una tabla y una variable con la cantidad
	 * de elementos por operación */
	static int[] suma(int t[], int numElementos) {
		// Tabla para guardar los resultados obtenidos
		int[] resultados;
		
		/* Variable "suma" para ir sumando y guardando temporalmente
		 * en ella el valor de la suma que se está ejecutando actualmente */
		int suma = 0;
		
		/* Le indicamos a la tabla que tenga la longitud de la tabla recibida
		 * menos el número de elementos (este menos 1) para calcular así
		 * el número de operaciones que necesitaremos realizar */
		resultados = new int[t.length - (numElementos - 1)];
		
		// For para guardar la suma en la tabla de los resultados
		for (int i = 0; i < (resultados.length); i++) {
			/* Sumamos a la variable suma los elementos que corresponden
			 * (es decir, sumamos la cantidad de números que el usuario
			 * indicó) */
			for (int j = i; j < (numElementos + i); j++) {
				suma += t[j]; // Lo añadimos a suma
			}
			
			resultados[i] = suma; // Añadimos la suma
			suma = 0; // Restablecemos la suma temporal a 0
		}
		
		return resultados; // Devolvemos los resultados
	}

	public static void main(String[] args) {
		// Creamos una tabla con los valores que queramos
		int[] table = new int[] {10, 1, 5, 8, 9, 2};
		
		// Imprimimos por pantalla la tabla que obtenemos con la función
		System.out.print(Arrays.toString(suma(table, 3)));

	}

}
