package ejerciciosjuegos;

import java.util.Arrays;
import java.util.Random;

public class Ejer2 {
	
	static int[] randomTable(int[] table) {
		Random random = new Random();
		
		int pos1;
		int pos2;
		
		int aux;
		
		for (int i = 0; i < table.length; i++) {
			pos1 = random.nextInt(0, table.length);
			pos2 = random.nextInt(0, table.length);
			
			aux = table[pos2];
			table[pos1] = table[pos2];
			table[pos2] = aux;
		}
		
		return table;
	}

	public static void main(String[] args) {
		int[] table = new int[] {1, 2, 3};
		
		randomTable(table);
		
		System.out.print(Arrays.toString(table));
	}

}
