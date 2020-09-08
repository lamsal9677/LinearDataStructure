package project0;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputFromFileAndInArray {
	public static void main(String args[]) throws FileNotFoundException {
		
		File file = new File("D:\\Programming\\Java Workspace Main\\EECS2500-Fall 2020\\src\\project0\\Address.txt");//
		Scanner input = new Scanner(file);
		ArrayList<String> InitialAllValue=new ArrayList<String>();
		int a=0;
		while (input.hasNext()) {
			a++;
			InitialAllValue.add(input.nextLine());
		}
		input.close();
		int b=0;
		String[] Input = new String[a];
		for (int i=5;i<InitialAllValue.size();i = i+6) {
			System.out.println(InitialAllValue.get(i));//getting the zip codes
			Input[b] = InitialAllValue.get(i);//making a new array of zip codes
			b++;
		}
	}   
}

//search zip code in the array and find the surrounding terms
//EG: ZIP IS IN 5 : get 0,1,2,3,4
//EG ZIP IS IN 11 : get 6,7,8,9,10