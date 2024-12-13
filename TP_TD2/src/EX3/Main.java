package EX3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str=new StringBuffer();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Entrer le mot :");
		str.append(sc.next().toCharArray()) ;
		
		for (int i =str.length()-1;i>=0;i--) {
			System.out.print(str);
		}
	}

}
