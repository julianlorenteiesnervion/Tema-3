package englishexercises;

import java.util.*;

public class Exer1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		// Array with 10 positions
		int array[] = new int[10];
		
		// Variable where we'll save the position
		int position;
		
		// Input of the user
		String inputValue = "X";
		
		// Loop until the user wants to leave
		while (!inputValue.equals("c")) {
			// Show the options
			System.out.print("A. Show values\n"
					+ "B. Introduce a value\n"
					+ "C. Exit");
			
			// We ask the user to type a character
			System.out.print("\nType a character: ");
			// We store the letter
			inputValue = (reader.next()).toLowerCase();
			
			// Show the table
			if (inputValue.equals("a"))
				System.out.println(Arrays.toString(array));
			// Change a position to add a number
			else if (inputValue.equals("b")) {
				System.out.print("Type the position: ");
				position = reader.nextInt();
				
				System.out.print("Type the value you want to store: ");
				array[position] = reader.nextInt();
			}
		}
		
		System.out.print("You've succesfully closed the program.");
		
		reader.close();

	}

}
