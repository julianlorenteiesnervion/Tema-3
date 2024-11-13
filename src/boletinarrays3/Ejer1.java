package boletinarrays3;

public class Ejer1 {

	public static void main(String[] args) {
		// Creamos la tabla bidimensional con los datos
		int[][] array = {
				{0, 30, 2, 0, 0, 5},
				{75, 0, 0, 0, 0, 0},
				{0, 0, -2, 9, 0, 11}
		};
		
		// Eje Y
		for (int j = 0; j < 3; j++) {
			// Eje X
			for (int i = 0; i < 6; i++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println(); // Salto de línea
		}
	}

}
