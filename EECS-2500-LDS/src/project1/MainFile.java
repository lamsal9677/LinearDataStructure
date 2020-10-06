package project1;

import java.util.Scanner;

public class MainFile {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter the Range: ");
		String Input = stdin.nextLine();
		String[] InputArray = Input.split(" ");
		
		int Start = Integer.parseInt(InputArray[0]);
		int End = Integer.parseInt(InputArray[1]);
		
		while(!isValid(Start,End)) {//while isValid is false
			System.out.println("Enter the Range: ");
			Input = stdin.nextLine();
			InputArray = Input.split(" ");
			Start = Integer.parseInt(InputArray[0]);
			End = Integer.parseInt(InputArray[1]);
		}
		
		System.out.println("Palindromes:");
		System.out.println("Base"+"\t"+"\t"+"10 Binary");
		
		int CurrentIndex = Start;
		int BinaryEquivalent=0;
		while(CurrentIndex <= End) {
			BinaryEquivalent = inBinary(CurrentIndex);
			if (isPalindromeInNormalWay(CurrentIndex) && isPalindromeInNormalWay(BinaryEquivalent)) {//does check in normal way
				System.out.printf("%-16d"+"%d"+"\n",CurrentIndex,BinaryEquivalent);		
			}
		CurrentIndex++;
		}
				
	}
	
	public static boolean isValid(int Start, int End) {
		
		if (Start>=End) {
			System.out.println("First number is larger than second number. Try Again.");
			return false;
		}
		
		if (Start < 0 || End < 0) {
			System.out.println("Invalid value entered. All values must be greater than zero. Try Again.");
			return false;
		}
		
		if (Start == 0 || End == 0) {
			System.out.println("Invalid value entered. All values must be greater than zero. Try Again.");
			return false;
		}
		
		return true;
	}
	public static int inBinary(int Number) {
		String BinaryEquivalent = "";
		for(int i = Number;i!=0; i=i/2) {
			BinaryEquivalent = (Integer.toString(i%2)) + BinaryEquivalent;
		}
		return Integer.parseInt(BinaryEquivalent);
	}
	
	public static boolean isPalindromeInNormalWay(int Number) {
		
		String NumberString = Integer.toString(Number);
		
		int i=0;int j=NumberString.length()-1;
		while (i<j) {
			if (NumberString.charAt(i)!=NumberString.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;		
	}
}
