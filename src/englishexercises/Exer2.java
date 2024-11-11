package englishexercises;

import java.util.*;

public class Exer2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Variables for things we'll use later
		int value;
		int increase;
		int length;
		
		// We ask for those 3 values
		System.out.print("Type a value: ");
		value = reader.nextInt();
		
		System.out.print("Type the increase: ");
		increase = reader.nextInt();
		
		System.out.print("Type the length of the array: ");
		length = reader.nextInt();
		
		// Array with the length the user typed
		int array[] = new int[length];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = value;
			value+=increase;
		}
		
		System.out.print(Arrays.toString(array));
		
		reader.close();

	}

}
