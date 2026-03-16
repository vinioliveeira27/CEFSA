package lacoderepeticao;

import java.util.Scanner;

public class LacoDeRepeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, x, contNegativo = 0;
		Scanner leia = new Scanner(System.in);

		for (x = 1; x <= 5; x++) {
			System.out.println("\nEntre com um valor: ");
			a = leia.nextInt();
			if (a < 0) {
				contNegativo++;
			}
		}
		System.out.println("\nTemos: " + contNegativo + " número(s) negativo(s)...");
	}

}
