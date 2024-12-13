package EX5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int sum=0;
			int n=1;
			Scanner sc =new Scanner(System.in);
			
			while (n<=3){
				System.out.print("Entrer le number "+n+"  :");
				sum+=sc.nextInt();
				sc.nextLine();
				n++;
			}
			System.out.print("la somme est :"+sum);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.print("erreur de saisir !");
		}
		
	}

}
