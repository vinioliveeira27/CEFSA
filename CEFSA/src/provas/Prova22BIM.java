package provas;

import java.util.Scanner;

public class Prova22BIM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double mediaidadeotimo = 0, ppb;
		int porcentagembom = 0, somaidadeotimo = 0, cont = 0, qpr = 0, somaidade = 0, idade = 0, contregular = 0,
				avaliacao = 0, contbom = 0, contotimo = 0;

		do {
			System.out.println("Digite a sua idade: ");
			somaidade += idade;
			System.out.println("Avalie o filme:");
			System.out.println("3 - ÓTIMO:");
			System.out.println("2 - BOM");
			System.out.println("1 - REGULAR");
			cont++;
			if (avaliacao == 1) {
				contregular++;
			} else if (avaliacao == 2) {
				contbom++;
			} else {
				contotimo++;
				somaidadeotimo += idade;
			}
			
		} while (cont == 4);

		mediaidadeotimo = contotimo / somaidadeotimo;
		porcentagembom = contbom * 20;
		System.out.println(mediaidadeotimo);
		System.out.println(contregular);
		System.out.println(porcentagembom);

	}
}