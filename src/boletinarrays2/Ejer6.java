package boletinarrays2;

import java.util.*;

public class Ejer6 {

	public static void main(String[] args) {
		Random random = new Random();
		
		/* Guardamos el número random temporalmente
		aquí antes de guardarlo en la tabla */
		int randomTemporal;
		
		// Contador para contar la cantidad de números generados
		int count = 0;
		
		// Cantidad de aciertos
		int aciertos = 0;
		
		/* Tabla apuesta para generar la apuesta
		 * dentro y la tabla ganadora */
		int[] apuesta = new int[6];
		int[] ganador = {5, 14, 17, 20, 38, 45};
		
		// Mientras el contador sea menor que 6...
		while (count < 6) {
			// Generamos un número aleatorio
			randomTemporal = random.nextInt(1, 50);
			// Ordenamos el array
			Arrays.sort(apuesta);
			/* Buscamos si ese número no existe en la tabla,
			 * si no existe, lo añadimos e incrementamos el
			 * contador de números generados */
			if ((Arrays.binarySearch(apuesta, randomTemporal)) < 0) {
				apuesta[0] = randomTemporal;
				count++;
			}
		}
		
		// Imprimimos la apuesta
		System.out.println(Arrays.toString(apuesta));
		
		/* For each para ir consultando cada valor de la
		 * apuesta y comprobar si está en la tabla
		 * ganadora con un binary search */
		for (int valor : apuesta) {
			if (Arrays.binarySearch(ganador, valor) >= 0)
				aciertos++; // Si acertamos, incrementamos los aciertos
		}
		
		// Imprimimos los aciertos
		System.out.print("Número de aciertos: " + aciertos);

	}

}
