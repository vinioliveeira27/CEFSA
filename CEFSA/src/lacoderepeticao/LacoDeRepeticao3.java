package lacoderepeticao;

import java.util.Scanner;

public class LacoDeRepeticao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		// coletando dados sobre o salário e número de filhos.
		// A prefeitura deseja saber:
		// a) média do salário da população;
		// b) média do número de filhos;
		// c) maior salário;
		// d) percentual de pessoas com salário até R$100,00.

		float sal, somaSal = 0, mediaSal, mediaNf, perc, maiorSal = 0;
		int nf, somaNf = 0, x, cont100 = 0;

		Scanner leia = new Scanner(System.in);

		for (x = 1; x <= 5; x++) {
			System.out.println("\nEntre com o salário do habitante " + x + ": ");
			sal = leia.nextFloat();
			System.out.println("\nEntre com a quantidade de filhos: ");
			nf = leia.nextInt();
			somaSal += sal;// mesma coisa de: somaSal = somaSal + sal
			somaNf += nf;

			if (maiorSal < sal) {
				maiorSal = sal;
			}

			if (sal <= 100) {
				cont100++;
			}
		}
		mediaSal = somaSal / 5;
		mediaNf = somaNf / 5;
		perc = (cont100 * 100) / 5;

		System.out.printf("\nMédia salarial: %.2f ", mediaSal);
		System.out.printf("\nMédia do número de filho(s): %.2f ", mediaNf);
		System.out.println("\nMaior salário: " + maiorSal);
		System.out.printf("\nPercentual de pessoas que recebem até 100 reais: %.2f ", perc);
	}

}
