package lacosDeDecisao;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exemplo 1 - Número positivo ou negativo
		int numero = -5;
		if (numero >= 0) {
			System.out.println("Número positivo");
		} else {
			System.out.println("Número negativo");
		}

		// Exemplo 2 - Par ou ímpar
		int n = 7;
		if (n % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}

		// Exemplo 3 - Maior de idade
		int idade = 20;
		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}

		// Exemplo 4 - Maior entre dois números
		int a = 10;
		int b = 15;
		if (a > b) {
			System.out.println("A é maior");
		} else {
			System.out.println("B é maior");
		}

		// Exemplo 5 - Aprovado ou reprovado
		double nota = 6.5;
		if (nota >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

		// Exemplo 6 - Faixa de nota (if / else if)
		int notaAluno = 8;
		if (notaAluno >= 9) {
			System.out.println("Excelente");
		} else if (notaAluno >= 7) {
			System.out.println("Bom");
		} else if (notaAluno >= 5) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}

		// Exemplo 7 - Pode dirigir
		int idadeMotorista = 19;
		boolean temCarteira = true;
		if (idadeMotorista >= 18 && temCarteira) {
			System.out.println("Pode dirigir");
		} else {
			System.out.println("Não pode dirigir");
		}

		// Exemplo 8 - Desconto em compra
		double valorCompra = 150;
		if (valorCompra > 100) {
			System.out.println("Desconto aplicado");
		}

		// Exemplo 9 - Login simples
		String usuario = "admin";
		String senha = "1234";

		if (usuario.equals("admin") && senha.equals("1234")) {
			System.out.println("Login correto");
		} else {
			System.out.println("Login incorreto");
		}

		// Exemplo 10 - Número dentro de intervalo
		int x = 25;
		if (x >= 10 && x <= 30) {
			System.out.println("Número dentro do intervalo");
		}

	}
}
