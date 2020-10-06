package project1;
public class PalindromeCheckStack {
	
	private int CurrentEmpty = 0;
	String[] StackArray = new String[32];

	public PalindromeCheckStack() {
		
	}
	public String pop() {
		String PopOutput = StackArray[this.CurrentEmpty-1];
		StackArray[this.CurrentEmpty-1]=null;
		this.CurrentEmpty--;
		return PopOutput;
	}
	public void push(String n) {
		
		StackArray[this.CurrentEmpty] = n;
		this.CurrentEmpty++;
	}
	public String get(int index) {
		return StackArray[index]; 
	}
	
	public static void main(String[] args) {
		PalindromeCheckStack newStack = new PalindromeCheckStack();
		newStack.push("4");
		newStack.push("5");
		newStack.push("6");		
		System.out.println(newStack.pop());
		newStack.pop();
		System.out.println(newStack.pop());
	}
	
}