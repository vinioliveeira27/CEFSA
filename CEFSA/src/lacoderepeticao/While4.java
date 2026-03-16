package lacoderepeticao;

import java.util.Scanner;

public class While4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Faça um programa que, para um número indeterminado de pessoas: leia a
		// idade de cada uma, sendo que
		// a idade 0 (zero) indica o fim da leitura e não deve ser considerada. A seguir
		// calcule:
		// o número de pessoas;
		// a idade média do grupo;
		// a menor idade e a maior idade

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a idade da pessoa: ");
		int idade = sc.nextInt();
		int contpessoas = 0;
		int res = 0;
		int media = 0;
		int menoridade = idade;
		int maioridade = idade;

		while (idade != 0) {
			contpessoas++;
			res += idade;

			if (idade < menoridade) {
				menoridade = idade;
			}
			if (idade > maioridade) {
				maioridade = idade;
			}
			System.out.println("Entre com a idade da pessoa: ");
			idade = sc.nextInt();
		}

		media = res / contpessoas;

		System.out.println("Idade média do grupo: " + media);
		System.out.println("Pessoas totais: " + contpessoas);
		System.out.println("Menor idade: " + menoridade);
		System.out.println("Maior idade: " + maioridade);
		sc.close();
	}

}
