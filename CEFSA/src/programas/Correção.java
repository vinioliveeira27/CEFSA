package programas;

import java.util.Scanner;

public class Correção {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        int A, B, C, RES;

	        Scanner leia = new Scanner(System.in);

	        // Entrada dos valores
	        System.out.print("Entre com o valor de A: ");
	        A = leia.nextInt();

	        System.out.print("Entre com o valor de B: ");
	        B = leia.nextInt();

	        System.out.print("Entre com o valor de C: ");
	        C = leia.nextInt();

	        // Soma de A e B
	        RES = A + B;

	        // Verificação da condição
	        if (RES > C) {
	            System.out.println("A soma de A + B é maior que C");
	        } else if (RES == C) {
	            System.out.println("A soma de A + B é igual a C");
	        } else {
	            System.out.println("A soma de A + B é menor que C");
	        }

	        leia.close();
	    }
	}
