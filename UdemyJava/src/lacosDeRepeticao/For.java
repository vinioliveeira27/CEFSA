package lacosDeRepeticao;

public class For {

	public static void main(String[] args) {

		// Exemplo 1 - Contar de 1 até 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// Exemplo 2 - Contagem regressiva
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		// Exemplo 3 - Números pares de 0 a 20
		for (int i = 0; i <= 20; i += 2) {
			System.out.println(i);
		}

		// Exemplo 4 - Tabuada do 5
		for (int i = 1; i <= 10; i++) {
			System.out.println("5 x " + i + " = " + (5 * i));
		}

		// Exemplo 5 - Somar números de 1 a 100
		int soma = 0;
		for (int i = 1; i <= 100; i++) {
			soma += i;
		}
		System.out.println("Soma = " + soma);

		// Exemplo 6 - Percorrer um vetor
		int[] numeros = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		// Exemplo 7 - Percorrer uma matriz
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j]);
			}
		}

	}
}