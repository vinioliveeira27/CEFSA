package programacaosequencial;

import java.util.Scanner;

public class ProgramacaoSequencial3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int anos,meses,dias,td;
		
		Scanner calculo3=new Scanner(System.in);
		
		System.out.println("\nDigite a quantidade de anos: ");
		anos = calculo3.nextInt();
		System.out.println("\nDigite a quantidade de meses: ");
		meses = calculo3.nextInt();
		System.out.println("\nDigite a quantidade de dias: ");
		dias = calculo3.nextInt();
		
		td = anos*365+meses*30+dias;
		System.out.println("\nO total de dias é: "+td);


	}

}
