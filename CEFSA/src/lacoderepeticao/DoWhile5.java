package lacoderepeticao;

import java.util.Scanner;

public class DoWhile5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Faça um programa que leia número reais maiores que zero. Quando for entrado o
		// número zero,
		// o programa deverá apresentar quantos números foram entrados e a média destes.

		Scanner leia = new Scanner(System.in);
		boolean tenteNovamente = false;

		System.out.println("\nEntre com qualquer número e finalize digitando 0");

		double x = leia.nextDouble();
		double contpos = 0;
		double res = 0;

		while (x != 0) {
			contpos++;
			res += x;
			x = leia.nextDouble();
			if(x>0) {
				res += x;

			}

		}

		System.out.println("\nQntd de N positivos:" + contpos);
		System.out.println("\nO resultado total é:" + res);

	}
}
