package lacoDeDecisao;

import java.util.Scanner;

public class LacoDeDecisao8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escreva um sistema que leia o número do empregado, o número de horas trabalhadas e o salário por hora, e calcule o salário do mês.
		//Cada hora trabalhada acima de 40 é paga com 50% de acréscimo sobre a hora trabalhada regular.

		int HE,NE,NHT,SH,salario;
		String nome;
		//NE=NÚMERO DO EMPREGADO.NHT=NÚMERO DE HORAS TRABALHADAS.SH=SALÁRIO P/HORA.HE=HORAS EXCEDENTES.HE=HORAS EXTRAS.
		
		Scanner chapa=new Scanner(System.in);
		
		System.out.println("\nEntre com o nome do funcionário: ");
		nome=chapa.nextLine();
		System.out.println("\nEntre com o número do funcionário:");
		NE=chapa.nextInt();
		System.out.println("\nEntre com a quantidade de horas trabalhadas: ");
		NHT=chapa.nextInt();
		System.out.println("\nEntre com o salário por hora do funcionário: ");
		SH=chapa.nextInt();
		
		
		if (NHT<=40) {
			salario=NHT*SH;
			
			System.out.println("\nNúmero do funcionário: "+NE);
			System.out.println("\nNome do funcionário: "+nome);
			System.out.println("\nSeu salário é de: R$"+salario);
		}else{
			HE = NHT-40;
			salario= (int) ((40*SH) + (HE*(SH*1.5)));
			
			System.out.println("\nNome do funcionário: "+nome);
			System.out.println("\nNúmero do funcionário: "+NE);
			System.out.println("\nSeu salário é de: "+salario);

			
		}
		
	
			
			
			
		}
	}
