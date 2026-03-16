package lacoderepeticao;

import java.util.Scanner;

public class While5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a idade da pessoa (0 para sair): ");
        int idade = sc.nextInt();

        int contpessoas = 0;
        int soma = 0;
        int menoridade = Integer.MAX_VALUE; // valor inicial bem alto
        int maioridade = Integer.MIN_VALUE; // valor inicial bem baixo

        while (idade != 0 && idade > 0) {
            contpessoas++;
            soma += idade;

            // Verifica menor e maior idade
            if (idade < menoridade) {
                menoridade = idade;
            }
            if (idade > maioridade) {
                maioridade = idade;
            }

            System.out.println("Entre com a idade da pessoa (0 para sair): ");
            idade = sc.nextInt();
        }

        if (contpessoas > 0) { // evita divisão por zero
            double media = (double) soma / contpessoas;

            System.out.println("\nPessoas totais: " + contpessoas);
            System.out.println("Idade média do grupo: " + media);
            System.out.println("Menor idade: " + menoridade);
            System.out.println("Maior idade: " + maioridade);
        } else {
            System.out.println("Nenhuma idade válida foi informada.");
        }

        sc.close();
    }
}