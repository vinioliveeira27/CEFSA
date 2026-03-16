package programas;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nomeAluno; 
		float n1,n2,n3,media,x,y; 

		Scanner leia = new Scanner(System.in); 

		System.out.println("\nEntre com o nome do aluno: "); 
		nomeAluno = leia.nextLine(); 
		System.out.println("\nEntre com a primeira nota: "); 
		n1 = leia.nextFloat(); 
		System.out.println("\nEntre com a segunda nota: "); 
		n2 = leia.nextFloat(); 
		System.out.println("\nEntre com a terceira nota: "); 
		n3 = leia.nextFloat(); 

		media = (n1+n2+n3)/3; 

		System.out.println("\nNome do aluno: "+nomeAluno); 
		System.out.println("\nSua média foi de: "+media); 
		System.out.printf("\nSua média foi de: %5.2f",media); 

		x = (float) Math.sqrt(n1); 
		y = (float) Math.pow(n2, 3);
	}

}
