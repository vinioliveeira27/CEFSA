package lacoderepeticao;

public class For8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Desenvolver um sistema que efetue
		// a soma de todos os números ímpares que são múltiplos de três e
		// que se encontram no conjunto dos números de 1 até 500.

		int somatorio = 0;

		for (int i = 1; i <= 500; i++) {
			if (i % 2 == 1 && i % 3 == 0) {
				somatorio += i;
			}
		}
		System.out.println(somatorio);
		
	}

}
