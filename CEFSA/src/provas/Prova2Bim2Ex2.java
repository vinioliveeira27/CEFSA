package provas;

import java.util.Scanner;

public class Prova2Bim2Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("Nome do atleta (ENTER para sair): ");
			String nome = sc.nextLine();

			if (nome.equals(""))
				break;

			double s1, s2, s3, s4, s5;

			System.out.print("Primeiro salto: ");
			s1 = sc.nextDouble();

			System.out.print("Segundo salto: ");
			s2 = sc.nextDouble();

			System.out.print("Terceiro salto: ");
			s3 = sc.nextDouble();

			System.out.print("Quarto salto: ");
			s4 = sc.nextDouble();

			System.out.print("Quinto salto: ");
			s5 = sc.nextDouble();

			System.out.println("\nAtleta: " + nome);

			System.out.println("Primeiro Salto: " + s1);
			System.out.println("Segundo Salto: " + s2);
			System.out.println("Terceiro Salto: " + s3);
			System.out.println("Quarto Salto: " + s4);
			System.out.println("Quinto Salto: " + s5);

			double melhor = s1;
			if (s2 > melhor)
				melhor = s2;
			if (s3 > melhor)
				melhor = s3;
			if (s4 > melhor)
				melhor = s4;
			if (s5 > melhor)
				melhor = s5;

			double pior = s1;
			if (s2 < pior)
				pior = s2;
			if (s3 < pior)
				pior = s3;
			if (s4 < pior)
				pior = s4;
			if (s5 < pior)
				pior = s5;

			double soma = s1 + s2 + s3 + s4 + s5;

			double media = (soma - melhor - pior) / 3;

			System.out.println("\nMelhor salto: " + melhor);
			System.out.println("Pior salto: " + pior);
			System.out.printf("Media dos demais saltos: %.1f", media);

			System.out.println("\nResultado final:"+nome+", "+media);
		}

	}
}
