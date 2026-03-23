/**
 * File: If statements
 * Author: Mr. Kalisz
 * Date Created: Mar 23, 2026
 * Date Last Modified: Mar 23, 2026
 */


import java.util.Scanner;

class Notes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;

		System.out.print("Input a number greater than 5: ");
        num = input.nextInt();

		//if (boolean expression)
		
		if (num > 5) {
			//This code will only run when the condition above is true
			System.out.println(num + " is greater than 5");
			num = num + 5;
		}

		if (num < 5) {
			System.out.println(num + " is less than 5");
		}

		System.out.println("Rest of our code");
		System.out.println(num);
		
		String word;
        word = "Bye";
        
        if (word.equals("Bye")) {
            System.out.println(word + " is equal to Bye");
            String word2; //local variable - only exists in this if statement
            word2 = "Bye";
            System.out.println(word.equals(word2));
        }

		// System.out.println(word2);

	}
}
