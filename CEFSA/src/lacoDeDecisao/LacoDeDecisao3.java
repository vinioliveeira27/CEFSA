package lacoDeDecisao;

import java.util.Scanner;

public class LacoDeDecisao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Desenvolva um sistema em java que->Leia 4 (quatro) números; Calcule o quadrado de cada um;
		//Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		//Caso contrário, imprima os valores lidos e seus respectivos quadrados.

			float N1,N2,N3,N4,Q1 = 0,Q2 = 0,Q3 = 0,Q4 = 0;
			
			Scanner xuxa = new Scanner(System.in);
			
			System.out.println("\nDigite o número 1");
			N1 = xuxa.nextFloat();
			Q1=(float) Math.pow(N1, 2);
			
			System.out.println("\nDigite o número 2");
			N2 = xuxa.nextFloat();
			Q2=(float) Math.pow(N2, 2);
			
			System.out.println("\nDigite o número 3");
			N3 = xuxa.nextFloat();
			Q3=(float) Math.pow(N3, 2);
			if (Q3>=1000) {
				System.out.println("\nO quadrado de N3 é de: "+Q3);
			}else{
			
			System.out.println("\nDigite o número 4");
			N4 = xuxa.nextFloat();
			Q4=(float) Math.pow(N4, 2);
			
			System.out.println("\nPrimeiro número: "+N1+"\nO quadrado de N1 é de: "+Q1);
			System.out.println("\nSegundo número: "+N2+"\nO quadrado de N2 é de: "+Q2);
			System.out.println("\nTerceiro número: "+N3+"\nO quadrado de N3 é de: "+Q3);
			System.out.println("\nQuarto número: "+N4+"\nO quadrado de N4 é de: "+Q4);
			
					}

			}
	}


