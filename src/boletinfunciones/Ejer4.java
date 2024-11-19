package boletinfunciones;

public class Ejer4 {
	static int buscar(int t[], int clave) {
		int found = -1;
		int pos = 0;
		
		while (t[pos] != clave || pos < t.length) {
			pos++;
			
			if (t[pos] == clave) {
				found = pos;
			}
		}
		
//		for (int value : t) {
//			if (value == clave)
//				found = pos;
//			
//			pos++;
//		}
		
		return found;
	}
	

	public static void main(String[] args) {
		int[] table = new int[] {3, 4, 5, 6, 7};
		
		System.out.print(buscar(table, 2));
	}

}
