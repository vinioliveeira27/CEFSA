package programacaosequencial;

import java.util.Scanner;

public class ProgramacaoSequencial5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.

		int n1,n2,n3;
		float media;
		
		Scanner ps5=new Scanner(System.in);
		
		System.out.println("\nEntre com a 1ª nota: ");
		n1 = ps5.nextInt();
		System.out.println("\nEntre com a 2ª nota: ");
		n2 = ps5.nextInt();
		System.out.println("\nEntre com a 3ª nota: ");
		n3 = ps5.nextInt();
		
		media=(((n1*2)+(n2*3)+(n3*5))/10);
		System.out.println("\nSua nota final é de "+media);
	}

}
