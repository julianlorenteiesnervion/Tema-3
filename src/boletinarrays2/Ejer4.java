package boletinarrays2;

import java.util.*;

public class Ejer4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int ranking[] = new int[8]; // Array para el ranking
		int reversedRanking[] = new int[8]; // Array para guardar el ranking inverso
		
		// Variable "k" que usaré luego en un for
		int k = ranking.length;
		
		// Se repetirá 8 veces
		for (int i = 0; i < ranking.length; i++) {
			do { // Do-while para que introduzca una puntuación correcta
				System.out.print("Introduce una puntuación (1000 - 2800): ");
				ranking[i] = reader.nextInt();
			} while (ranking[i] < 1000 || ranking[i] > 2800);
		}
		
		// Ordenamos los números del array en orden ascendente
		Arrays.sort(ranking);
		
		// Invertimos el orden con este for
		for (int i = 0; i < ranking.length; i++) {
			k--;
			/* Al ir bajando "k" e ir subiendo "i", guardaremos
			 * en la última posición de "reversedRanking" el valor
			 * de la primera posición de "ranking" */
			reversedRanking[k] = ranking[i];
		}
		
		// for para imprimir las puntuaciones como si fuera un top
		for (int i = 0; i < ranking.length; i++) {
			System.out.println((i+1) + ". " + reversedRanking[i]);
		}
		
		reader.close();

	}

}
