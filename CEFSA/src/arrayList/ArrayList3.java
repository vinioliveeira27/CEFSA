package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String toString() {
        return "Produto: " + nome + " | Preço: R$ " + preco;
    }
}

public class ArrayList3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> lista = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Remover produto");
            System.out.println("4 - Buscar produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    lista.add(new Produto(nome, preco));
                    System.out.println("Produto adicionado!");
                    break;

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Lista vazia.");
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(i + " - " + lista.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o índice para remover: ");
                    int indice = sc.nextInt();

                    if (indice >= 0 && indice < lista.size()) {
                        lista.remove(indice);
                        System.out.println("Removido com sucesso!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome para buscar: ");
                    String busca = sc.nextLine();

                    boolean encontrado = false;

                    for (Produto p : lista) {
                        if (p.nome.equalsIgnoreCase(busca)) {
                            System.out.println("Encontrado: " + p);
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
