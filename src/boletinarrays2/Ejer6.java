package boletinarrays2;

import java.util.*;

public class Ejer6 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int randomTemporal;
		
		int[] apuesta = new int[6];
		int[] ganador = new int[6];
		
		for (int i = 0; i < apuesta.length; i++) {
			do {
			randomTemporal = random.nextInt(1, 50);
			} while (Arrays.binarySearch(apuesta, randomTemporal) >= 0);
			
			apuesta[i] = randomTemporal;
			Arrays.sort(apuesta);
			}
		
		System.out.println(Arrays.toString(apuesta));

	}

}
