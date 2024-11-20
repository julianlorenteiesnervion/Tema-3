package boletinfunciones;

import java.util.Arrays;

public class Ejer6 {
	
	static int[] suma(int t[], int numElementos) {
		int[] resultados;
		int suma = 0;
		
		resultados = new int[t.length - (numElementos - 1)];
		
		for (int i = 0; i < (resultados.length); i++) {
			for (int j = i; j < (numElementos + i); j++) {
				suma += t[j];
			}
			resultados[i] = suma;
			suma = 0;
		}
		
		return resultados;
	}

	public static void main(String[] args) {
		int[] table = new int[] {10, 1, 5, 8, 9, 2};
		
		System.out.print(Arrays.toString(suma(table, 3)));

	}

}
