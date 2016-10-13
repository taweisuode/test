package test;

class Stack{
	private int[] ints;
	private final static int MAX_INT = 100000;
	private int top = 0;
	public Stack(){
		ints = new int[9];
		top = -1 ;
	}
	public void push(int i) {
		ints[++top] = i;
	}
	public int pop() {
		return ints[top--];
	}

	public boolean isEmpty() {
		return(top == -1);
	}
}
public class MyStack {
	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println("入栈");
		for(int i = 10;i < 100; i = i + 10) {
			System.out.println(i);
			stack.push(i);
		}
		System.out.println("出栈");
		while (!stack.isEmpty()) {
			 int pop = stack.pop();
			 System.out.println(pop);
		}
		
	}
}