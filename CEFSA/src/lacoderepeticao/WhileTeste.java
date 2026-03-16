package lacoderepeticao;

import java.util.Scanner;

public class WhileTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("\nDigite um número X: ");
		int x=sc.nextInt();
		
		while (x < 70) {
			System.out.println("\nDigite outro número Y até que a soma entre Y e X resulte em 70 ou mais: ");
			int b=sc.nextInt();
			x+=b;
		}

		System.out.println("\nSoma maior ou igual a 70. ");

	}

}
