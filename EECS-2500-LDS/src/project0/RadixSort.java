package project0;

public class RadixSort {
	public static void main(String args[]) {
		
		String[] Input = {"11111","42012","41120","40303","45656","11111","22222","33333","23432","12131"};
		String[][] Radix = new String[Input.length][10];
		
		int position = (Input[1].length())-1;
		while (position>=0) {
			for(int a=0;a<Input.length;a++) {
				
				int j= Character.getNumericValue(Input[a].charAt(position));
				
				for(int i=(Input.length)-1 ; i>=0 ; i--) {
					if (Radix[i][j] == null) {
						Radix[i][j] = Input[a];
						break;
					}
				}
			}
			int x = 0;
			while(x<Input.length){
			for(int k=0;k<10;k++) {
				for(int l=(Input.length)-1; l>=0; l--) {
					if (Radix[l][k]!=null) {
						Input[x] = Radix[l][k];
						x++;
					}
				}
			}}				
			position--;
			for(int k=0;k<10;k++) {
				for(int l=(Input.length)-1; l>=0; l--) {
					Radix[l][k] = null;
				}}
		}
		for (int i=0; i<Input.length ; i++) 
		{System.out.println(Input[i]);}
	}
	
	
	
	
	
	
	public static int[] radixSort(int[] Input) {
		//String[][] Radix = new String[Input.length][10];
		
		return Input;
	}
}
