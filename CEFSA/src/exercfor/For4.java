package exercfor;

public class For4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, soma = 0;

		for (x = 1; x <= 500; x++) {
			if (x % 2 == 1 && x % 3 == 0) {
				soma = soma + x;
				System.out.println("\nO número " + x + " é impar e múltiplo de 3...");
			}
		}
		System.out.println("\nO somatório foi de: " + soma);
	}

}
