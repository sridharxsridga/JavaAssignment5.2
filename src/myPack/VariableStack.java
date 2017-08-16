/*
class VariableStack that can accept numbers more than its size. The size of the Stack will be
specified in the constructor. If the number of integers exceed the size, the stack should

automatically grow to accommodate the new element.

*/
package myPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VariableStack implements Stack {
	Scanner scanner = new Scanner(System.in);//creating Scanner object to get user input
	ArrayList<Integer> stack; //using ArrayList because size of arrayList grows dynamically unlike array whose size is fixed 
	private static int size; //size of stack
	static int position;  // holds the position of the stack
	static int maxSizeCounter = 0; //// to validate the max size of the stack
	int input;

	VariableStack(int size) {  //initializing the size 
		stack = new ArrayList<Integer>(size);  //with fixed length size 
		position = 0; //initially position of index is at 0
		this.size = size;//to get the size 
	}

	@Override
	public void push(int i) {  // method to push into stack
		int input;
		if (maxSizeCounter  == size) {  //checking is size of the stack has reached max size
			System.out.println("Stack OverFlow");  // when the specified size is reached
			stack.ensureCapacity(size+maxSizeCounter);  // dynamically increasing size
			stack.add(i);// inserting value to stack
			position++; //incrementing the index position
			maxSizeCounter++;//incrementing to check against the size of the stack
		} else {

			stack.add(i); // inserting value to stack
			position++;//incrementing the index position
			maxSizeCounter++;//incrementing to check against the size of the stack

		}

	}

	@Override
	public int pop() {  // method to pop from stack

		position--;//decrementing the index position
		System.out.println(stack.get(position)); //printing the popped value
		return stack.get(position); //return the value
	}

}
