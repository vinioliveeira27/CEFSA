package lacoDeDecisao;

import java.util.Scanner;

public class LaçoDeDecisao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
		//Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo
		//(50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um diagrama de blocos que
		//leia a variável P (peso de peixes) e verifique se há excesso. Se houver, gravar na variável E (Excesso)
		//e na variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.

		float peso,excesso,multa;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nDigite o peso do peixe: ");
		peso = input.nextFloat();
		
		if (peso > 50) {
	excesso = peso-50;
	multa = excesso*4;
		}else {
			excesso=0;
			multa=0;
		}
	
		System.out.println("\nSua multa é de: R$"+multa);
		
	}

}
