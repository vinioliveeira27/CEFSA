package lacosDeRepeticao;

public class While_e_outros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// =========================
		// WHILE
		// =========================

		// Exemplo 1 - Contar de 1 até 10
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		// Exemplo 2 - Contagem regressiva
		int x = 10;
		while (x >= 1) {
			System.out.println(x);
			x--;
		}

		// Exemplo 3 - Somar números até 5
		int soma = 0;
		int n = 1;
		while (n <= 5) {
			soma += n;
			n++;
		}
		System.out.println("Soma = " + soma);

		// =========================
		// DO WHILE
		// =========================

		// Exemplo 4 - Contar de 1 até 5
		int a = 1;
		do {
			System.out.println(a);
			a++;
		} while (a <= 5);

		// Exemplo 5 - Menu simples
		int opcao = 1;

		do {
			System.out.println("1 - Jogar");
			System.out.println("2 - Configurações");
			System.out.println("3 - Sair");

			opcao++;

		} while (opcao <= 3);

		// =========================
		// WHILE COM CONDIÇÃO LÓGICA
		// =========================

		// Exemplo 6 - Parar quando número chegar em 100
		int numero = 0;

		while (numero < 100) {
			numero += 10;
			System.out.println(numero);
		}

		// =========================
		// LOOP INFINITO COM BREAK
		// =========================

		// Exemplo 7 - Parar quando encontrar número específico
		int contador = 0;

		while (true) {
			contador++;

			if (contador == 5) {
				System.out.println("Encontrado!");
				break;
			}
		}

		// =========================
		// CONTINUE
		// =========================

		// Exemplo 8 - Pular número 5
		int c = 0;

		while (c <= 10) {
			c++;

			if (c == 5) {
				continue;
			}

			System.out.println(c);
		}

	}
}
