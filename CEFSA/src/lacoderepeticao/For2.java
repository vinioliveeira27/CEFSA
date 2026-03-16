package lacoderepeticao;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A prefeitura de uma cidade fez uma pesquisa entre 5 de seus habitantes,
		// coletando dados sobre o salário e número
		// de filhos. A prefeitura deseja saber:
		// a) média do salário da população;
		// b) média do número de filhos;
		// c) maior salário;
		// d) percentual de pessoas com salário até R$100,00.

		Scanner sc = new Scanner(System.in);
		double salarioTotal = 0;
		int filhosTotal = 0;
		double maiorSalario = 0;
		int contadorSalarioAte100 = 0;
		int totalPessoas = 5;

		for (int i = 1; i <= totalPessoas; i++) {
			System.out.print("Digite o salário da pessoa " + i + ": ");
			double salario = sc.nextDouble();

			System.out.print("Digite o número de filhos da pessoa " + i + ": ");
			int filhos = sc.nextInt();

			// Soma salário e filhos
			salarioTotal += salario;
			filhosTotal += filhos;

			// Verifica maior salário
			if (salario > maiorSalario) {
				maiorSalario = salario;
			}

			// Contador para salário até R$100
			if (salario <= 100) {
				contadorSalarioAte100++;
			}
		}


		double mediaSalario = salarioTotal / totalPessoas;
		double mediaFilhos = (double) filhosTotal / totalPessoas;
		double percentualAte100 = ((double) contadorSalarioAte100 / totalPessoas) * 100;
		
		System.out.printf("\nMédia do salário: R$ %.2f", mediaSalario);
		System.out.printf("\nMédia do número de filhos: %.2f", mediaFilhos);
		System.out.printf("\nMaior salário: R$ %.2f", maiorSalario);
		System.out.printf("\nPercentual de pessoas com salário até R$100,00: %.2f%%\n", percentualAte100);
		
		sc.close();
	}
}
