package programas;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		String nome = "João",nome2;
		int idade = 23,idade2;
		float altura = (float)1.73,altura2;
		
		System.out.println("\nNome do aluno: "+nome);
		System.out.println("\nIdade do aluno: "+idade);
		System.out.println("\nAltura do aluno: "+altura);
		
		System.out.println("\nNome do aluno: "+nome+"\nIdade do aluno: "+idade+"\nAltura do aluno: "+altura);

		System.out.println("\nEntre com o nome do aluno(a): ");
		nome2 = leia.nextLine();
		System.out.println("\nEntre com a idade do aluno(a): ");
		idade2 = leia.nextInt();
		System.out.println("\nEntre com a altura do aluno(a): ");
		altura2 = leia.nextFloat();
		
		System.out.println("\nNome: "+nome2+"\nIdade: "+idade2+"\nAltura: "+altura2);
	}

}
