package lacoDeDecisao;

import java.util.Scanner;

public class LacoDeDecisao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner chapa = new Scanner(System.in);
		
		System.out.println("\nEntre com o número: ");
		n=chapa.nextInt();
		
		if(n>100) {
			System.out.println("\nO valor foi de: "+n);
			} else {
				System.out.println("\nO valor foi de 0");
			}
		

	}

}
