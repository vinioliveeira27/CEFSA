package lacoderepeticao;

import java.util.Scanner;

public class LacoDeRepeticao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner capa = new Scanner(System.in);
		
		float n1,n2,n3,media, mg, somaMedia=0, maiorMedia=0, menorMedia=10;
		int x;
		String aluno;
		
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=5;x++)
		{
			System.out.println("\nEntre com o nome do aluno");
			aluno=leia.nextLine();
			leia.nextLine();
			
			System.out.println("\nEntre com a primeira nota:");
			n1=leia.nextFloat();
			
			System.out.println("\nEntre com a segunda nota:");
			n2=leia.nextFloat();
		
			System.out.println("\nEntre com a terceira nota:");
			n3=leia.nextFloat();
			
			media=(n1+n2+n3)/3;
			System.out.printf("\nMedia do(a) aluno(a)foi de: %.2f "+aluno,+media);
			
			somaMedia += media;
			if(maiorMedia<media) {
				maiorMedia =  media;
			}
			if(menorMedia>media) {
				menorMedia=media;
				
			}
		}
			mg=somaMedia/5;
			System.out.printf("\nMedia geral: %.2f ",+mg);
			System.out.println("\nMaior media: "+maiorMedia);
			System.out.println("\nMenor media: "+menorMedia);
	}
}