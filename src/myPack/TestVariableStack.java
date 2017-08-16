/*
 * This class is to do the operation on variable stack
 */


package myPack;

import java.util.Scanner;

public class TestVariableStack {
	static int choice; //for Stack operation
	static boolean option;  //for opertaion to continue or not

	public static void main(String[] args) {
		System.out.println("Variable Stack Operation \n");
		Scanner scanner = new Scanner(System.in);  //creating scanner object to accept user input
		VariableStack variableStack = new VariableStack(2); //creating variableStack object and initializing size of the stack

		do {//for Stack operation
			System.out.println("Option 1: Push ");
			System.out.println("Option 2: Pop ");
			System.out.println("Option 3: Exit ");
			System.out.println("Enter Option:");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter value to push:");
				choice = scanner.nextInt();
				variableStack.push(choice);
				break;
			case 2:
				variableStack.pop();
				break;
			case 3:
				System.exit(0);
				break;

			}
			System.out.println("Do you want to continue? true/false");
			option = scanner.nextBoolean();

		} while (option == true);

	}

}
