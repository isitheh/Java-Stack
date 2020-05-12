package gamasg.java.challenge;

public class JavaStack {
	private int stackArray[];
	private int top; 			//Pointer to the top of the stack.
	private int capacity; 		//How big can stack grow.
	
	public static void main(String[] args) {
		System.out.println("This is a JavaStack Program");
	}
	
	JavaStack(int capacity) {
		//Constructor
		this.stackArray = new int[capacity];
		this.capacity = capacity;
		this.top = -1;
	}
	
	//This function allows for an integer item to be pushed into the stack
	public void push(int item) {
		if(isFull(top)) {
			throw new RuntimeException("Stack is full!"); 
		}
		//Update the pointer to the top of the stack
		stackArray[++top] = item;
	}
	
	//This function allows for an integer item to be removed from the stack
	public int pop() {
		if(isEmpty(top)) {
			throw new RuntimeException("Stack is empty!"); 
		}
		//Update the pointer to the top of the stack
		return stackArray[--top];
	}

	//This function allows for an integer item to be viewed from the top of the stack
	public int peek() {
		if(isEmpty(top)) {
			throw new RuntimeException("Stack is empty!"); 
		}
		return stackArray[top];
	}
	
	//Check if the stack is empty
	public boolean isEmpty(int mTop) {
		return mTop == -1;
	}
	
	//Check if the stack has reached full capacity.
	public boolean isFull(int mTop) {
		return mTop == capacity -1;
	}
}
