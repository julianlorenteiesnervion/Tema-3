package boletinfuncionesbidimensionales;

public class Ejer4 {
	
	static boolean esMagica(int[][] tabla) {
		boolean esMagica = true;
		int value = 0;
		int sumaTemporal;
		int i = 1;
		int j;
		
		for (j = 0; j < tabla[0].length; j++) {
			value += tabla[0][j];
		}
		
		while (i < tabla.length && esMagica) {
			sumaTemporal = 0;
			
			for (j = 0; j < tabla[i].length; j++) {
				sumaTemporal += tabla[i][j];
			}
			
			if (sumaTemporal != value)
				esMagica = false;
			
			i++;
		}
		
		while (j < tabla[0].length && esMagica) {
			sumaTemporal = 0;
			
			for (i = 0; i < tabla.length; i++) {
				sumaTemporal += tabla[i][j];
			}
			
			if (sumaTemporal != value)
				esMagica = false;
			
			j++;
		}
		
		return esMagica;
	}

	public static void main(String[] args) {
		int[][] tabla = new int[][] {
			{4, 9, 2},
			{3, 5, 7},
			{8, 1, 6}
		};
		
		System.out.print(esMagica(tabla));
	}

}
