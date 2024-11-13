package boletinarrays3;

import java.util.*;

public class Ejer2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int[][] notas = new int[5][4];
		
		for (int a = 0; a < 4; a++) {
			for (int n = 0; n < 5; n++) {
				System.out.print("Introduce la nota " + (n+1) + " del alumno " + (a+1) + ": ");
				notas[n][a] = reader.nextInt();
			}
		}
		
		for (int a = 0; a < 4; a++) {
			for (int n = 0; n < 5; n++) {
				System.out.print(notas[n][a] + "\t");
			}
			System.out.println();
		}
		
		
		
		reader.close();

	}

}
