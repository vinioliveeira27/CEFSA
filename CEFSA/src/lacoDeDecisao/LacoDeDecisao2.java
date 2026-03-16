package lacoDeDecisao;

import java.util.Scanner;

public class LacoDeDecisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Elabore um sistema em java que leia as variáveis C e N, respectivamente código e número de horas trabalhadas
		//de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder
		//a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável.
		//A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.
		
		//C=CÓDIGO DO TRABALHADOR. N=HORAS TRABALHADAS. SE=EXCESSO DE PAGAMENTO.ST=SALÁRIO TOTAL. HE=HORAS EXTRAS.
		float C,N,SE = 0,ST = 0,HE;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("\nEntre com o código do funcionário: ");
		C=input.nextFloat();
		System.out.println("\nEntre com as horas trabalhadas: ");
		N=input.nextFloat();
		
		if (N <= 50) {
			ST = N*10;
		}else {
			HE = N-50;
			SE = HE*20;
			ST = SE+500;
		}
			System.out.println("\nCódigo do funcionário: "+C);
			System.out.println("\nSeu salário total é de: R$"+ ST);
			System.out.println("\nSeu salário excedente é de R$" +SE);
			
			
		}
			
		
		
		
		
	}

