package boletinfuncionesbidimensionales;

import java.util.Arrays;
import java.util.Random;

public class Ejer1 {
	
	static int[] minMax(int[][] tabla) {
		int minMax[] = new int[2];
		
		minMax[0] = tabla[0][0];
		minMax[1] = tabla[0][0];
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] < minMax[0])
					minMax[0] = tabla[i][j];
				else if (tabla[i][j] > minMax[1])
					minMax[1] = tabla[i][j];
			}
		}
		
		return minMax;
	}

	public static void main(String[] args) {
		Random random = new Random();
		
		int[][] array = new int[6][10];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(0, 1001);
			}
		}
		
		System.out.print(Arrays.toString(minMax(array)));
	}

}
