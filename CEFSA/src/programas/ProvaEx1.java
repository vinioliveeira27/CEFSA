package programas;

import java.util.Scanner;

public class ProvaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float SL, SB, VHE, VND, SMIN, SMES, VHT, NHT, ND, QH;
		// SM=SALARIO MINIMO. NHT=NUMERO DE HORAS TRABALHADAS.
		// ND=NUMERO DE DEPENDENTES. QH=QTD DE HORAS EXTRAS

		Scanner leia = new Scanner(System.in);

		System.out.println("\nInsira o salário mínimo: ");
		SMIN = leia.nextFloat();
		System.out.println("\nInsira o número de horas trabalhadas: ");
		NHT = leia.nextFloat();
		System.out.println("\nInsira o número de dependentes: ");
		ND = leia.nextFloat();
		System.out.println("\nInsira a quantidade de horas extras: ");
		QH = leia.nextFloat();

		VHT = (float) (0.2 * SMIN);
		SMES = (NHT * VHT);
		VND = ND * 32;
		VHE = (float) (VHT * 1.5);
		SB = SMES + VND + VHE;

		if (SB >= 200 && SB <= 500) {
			SL = (float) ((SB) - (SB * 0.1));
		} else if (SB >= 500) {
			SL = (float) ((SB) - (SB * 0.2));

		}

	}

}
