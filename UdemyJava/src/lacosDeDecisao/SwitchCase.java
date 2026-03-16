package lacosDeDecisao;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exemplo 1 - Dia da semana
		int dia = 3;

		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Dia inválido");
		}

		// Exemplo 2 - Calculadora simples
		char operador = '+';
		int a = 10;
		int b = 5;

		switch (operador) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;
		default:
			System.out.println("Operador inválido");
		}

		// Exemplo 3 - Menu de opções
		int opcao = 2;

		switch (opcao) {
		case 1:
			System.out.println("Cadastrar usuário");
			break;
		case 2:
			System.out.println("Listar usuários");
			break;
		case 3:
			System.out.println("Excluir usuário");
			break;
		default:
			System.out.println("Opção inválida");
		}

		// Exemplo 4 - Tipo de usuário
		String tipo = "admin";

		switch (tipo) {
		case "admin":
			System.out.println("Acesso total");
			break;
		case "moderador":
			System.out.println("Acesso intermediário");
			break;
		case "usuario":
			System.out.println("Acesso básico");
			break;
		default:
			System.out.println("Tipo desconhecido");
		}

		// Exemplo 5 - Nota convertida em conceito
		int nota = 4;

		switch (nota) {
		case 5:
			System.out.println("A");
			break;
		case 4:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		case 2:
			System.out.println("D");
			break;
		case 1:
			System.out.println("E");
			break;
		default:
			System.out.println("Nota inválida");
		}

	}
}
