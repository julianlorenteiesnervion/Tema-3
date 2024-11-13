package boletinarrays3;

import java.util.*;

public class Ejer2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int[][] notas = new int[4][5];
		
		int min;
		int max;
		double med;
		
		for (int a = 0; a < 4; a++) {
			for (int n = 0; n < 5; n++) {
				System.out.print("Introduce la nota " + (n+1) + " del alumno " + (a+1) + ": ");
				notas[a][n] = reader.nextInt();
			}
		}
		
		for (int a = 0; a < 4; a++) {
			for (int n = 0; n < 5; n++) {
				System.out.print(notas[a][n] + "\t");
			}
			System.out.println();
		}
		
		// 4 vueltas para los 4 alumnos
		for (int a = 0; a < 4; a++) {
		min = notas[a][0];
		max = notas[a][0];
		med = 0;
		
			// 5 notas de cada alumno
			for (int n = 0; n < 5; n++) {
				if (notas[a][n] < min)
					min = notas[a][n];
				if (notas[a][n] > max)
					max = notas[a][n];
				
				med += notas[a][n];
			}
		
		med /= 5;
		System.out.println("Alumno " + (a+1) + "\nNota mínima: " + min + "\n"
				+ "Nota máxima: " + max + "\n"
						+ "Nota media: " + med);
		
		System.out.println();
		}
		
		reader.close();

	}

}
