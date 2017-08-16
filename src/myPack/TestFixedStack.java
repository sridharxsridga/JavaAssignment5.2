/*
 * This class is to do the operation on fixed stack
 */


package myPack;

import java.util.Scanner;

public class TestFixedStack {
	static int choice; //for Stack operation
	static boolean option;//for opertaion to continue or not

	public static void main(String[] args) {
		System.out.println("Fixed Stack Operation \n");
		Scanner scanner = new Scanner(System.in);
		FixedStack fixedStack = new FixedStack(2);

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
				fixedStack.push(choice);
				break;
			case 2:
				fixedStack.pop();
				break;
			case 3:
				System.exit(0);
				break;

			}
			System.out.println("Do you want to continue? true/false"); //for opertaion to continue or not
			option = scanner.nextBoolean();

		} while (option == true);

	}

}
