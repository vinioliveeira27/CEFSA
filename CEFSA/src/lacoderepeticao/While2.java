package lacoderepeticao;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2- Faça um programa que simule a urna eletrônica. A tela a ser apresentada
		// deverá ser da seguinte forma:

		Scanner sc = new Scanner(System.in);
		System.out.println("As opções são:  ");
		System.out.println("1. Candidato Jair Rodrigues.");
		System.out.println("2. Candidato Carlos Luz  .");
		System.out.println("3. Candidato Neves Rocha");
		System.out.println("4. Nulo.");
		System.out.println("5. Branco.");
		System.out.println("6. Encerrar a votação.");
		System.out.println("Entre com seu voto:");
		int x = sc.nextInt();

		int cont=0;
		int jr = 0;
		int cl = 0;
		int nr = 0;
		int n = 0;
		int b = 0;
		String vencedor;

		while (x != 6) {
			cont++;
			switch (x) {
			case 1:
				jr++;
				break;
			case 2:
				cl++;
				break;
			case 3:
				nr++;
				break;
			case 4:
				n++;
				break;
			case 5:
				b++;
				break;
			default:
				System.out.println("\nDigita um valor válido!");
				break;
			}
			System.out.println("\nDigite novamente: ");
			x = sc.nextInt();
		}
		System.out.println("\nObrigado pelos votos.");
		System.out.println("\nVotos de Jair Rodrigues: " + jr);
		System.out.println("Votos de Carlos Luz: " + cl);
		System.out.println("Votos de Neves Rocha: " + nr);
		System.out.println("\nVotos nulos: " + n);
		System.out.println("Votos brancos: " + b);
		double pn = (double) n / (cont) * 100;
		double pb = (double) b / (cont) * 100;

		System.out.printf("\nPorcentagem de nulos: %.2f%%",pn);
		System.out.printf("\nPorcentagem de brancos: %.2f%%",pb);

		if (jr > cl && jr > nr) {
			vencedor = "Jair Rodrigues";
		} else if (cl > jr && cl > nr) {
			vencedor = "Carlos Luz";
		} else if (nr > jr && nr > cl) {
			vencedor = "Neves Rocha";
		} else {
			vencedor = "Houve empate entre os candidatos";
		}
		System.out.println("\nVencedor: " + vencedor);

		sc.close();
	}

}
