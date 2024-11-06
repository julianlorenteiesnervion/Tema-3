package boletinarrays;

public class Ejer4 {

	public static void main(String[] args) {
		// Declaración de la variable num con un array de 12 posiciones
		int num[] = new int[12];
		
		// Asignamos los valores a las posiciones especificadas por el ejercicio
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		// For para imprimir todos los números de la tabla del array de num
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		// Los valores que no fueron inicializados son asignados como 0's
		
	}

}
