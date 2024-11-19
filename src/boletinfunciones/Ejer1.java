package boletinfunciones;

public class Ejer1 {
	/* Creamos una función estática de tipo entero llamada
	 * "sumarTabla", que tendrá que recibir como entrada una
	 * tabla */
	static int sumarTabla(int[] array) {
		/* Inicializamos a 0 la variable que vamos a usar para
		guardar la suma */
		int suma = 0;
		
		/* For each para recorrer toda la tabla
		 * que recibimos como entrada e ir sumando
		 * esos valores a la variable suma */
		for (int value : array) {
			suma += value; // Sumamos el valor
		}
		
		// Devolvemos el valor de la suma
		return suma;
	}
	
	public static void main(String[] args) {
		// Creamos una tabla de ejemplo
		int[] tabla = new int[] {1, 2, 3, 4, 5};
		
		/* Imprimimos el resultado que nos da
		 * al aplicar esa función a la tabla
		 * que hemos creado */
		System.out.print(sumarTabla(tabla));
	}

}
