package Ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Entre un nombre entier :");
		int input=sc.nextInt();
		sc.nextLine();
		String stringInput=String.valueOf(input);
		
		for (int i =0 ; i<stringInput.length();i++) {
			System.out.println(stringInput.charAt(i));
		}
	}

}
