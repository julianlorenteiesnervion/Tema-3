package boletinarrays2;

import java.util.*;

public class Ejer6 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] apuesta = new int[6];
		int[] ganador = new int[6];
		
		for (int i = 0; i < apuesta.length; i++) {
			apuesta[i] = random.nextInt(1, 50);
			Arrays.sort(apuesta);
			}
		
		System.out.println(Arrays.toString(apuesta));

	}

}
