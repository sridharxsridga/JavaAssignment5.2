/*
class FixedStack that can accept a fixed numbers of integers. The size of the Stack will be specified
in the constructor. If the number of integers exceed the size, “Stack overflow” message  be
displayed.
*/

package myPack;

import java.util.Scanner;

public class FixedStack implements Stack {
	Scanner scanner = new Scanner(System.in);
	int[] stack; //using  Array because size is fixed
	private int size;		//size of stack
	static int position;   // holds the position
	static int maxSizeCounter = 0;  // to validate the max size of the stack

	FixedStack(int size) { //initializing the size 
		stack = new int[size];//creating array of stct with with fixed length size 
		position = 0;//initially position of index is at 0
		this.size = size; //to get the size 

	}

	@Override
	public void push(int input) {     // method to push into stack
		
		if (maxSizeCounter == size) { //checking is size of the stack has reached max size
			System.out.println("Stack OverFlow");

		} else {

			stack[position] = input; // inserting value to stack
			position++;//incrementing the index position
			maxSizeCounter++; //incrementing to check against the size of the stack

		}
	}

	@Override
	public int pop() {  // method to pop from stack
		//
		position--; //decrementing the index position
		System.out.println(stack[position]); //printing the popped value
		return stack[position]; //return the value

	}

}
