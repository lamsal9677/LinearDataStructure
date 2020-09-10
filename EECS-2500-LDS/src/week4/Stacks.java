package week4;

import java.util.Stack;

public class Stacks {
	public static void main(String args[]) {
		
		Stack<String> games = new Stack<String>(); //This is making a stack Stack stack = new Stack();
		
		games.add("Fortnite");
		games.add("COD");
		games.add("Dota");
		games.add("Mario");
		games.add("AGAR.IO");
		
		System.out.println(games);
		System.out.println(games.pop());//removes LIFO
		System.out.println(games);
		System.out.println(games.pop());//Removes LIFO
		System.out.println(games);
		System.out.println(games.peek());//look like pop but leaves stack as it is
		System.out.println(games);
		
		System.out.println(games.contains("PUBG"));
		System.out.println(games.contains("Fortnite"));
		
		//.empty
		System.out.println(games.get(0)); //go from bottom to top but peek and pop LIFO
		
		
	}
}

/* 
 * Last in FIrst out
 * PUSH -- into top
 * POP -- from top of the stack
 * Unbounded v.s. Bounded Stack
 * Array - Bounded | Array list - Unbounded
 * 
*/