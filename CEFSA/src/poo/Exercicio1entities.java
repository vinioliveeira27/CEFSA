package poo;

import java.text.NumberFormat;

public class Exercicio1entities {

    // Atributos privados (encapsulamento)
    // Representam os dados do empregado
    private String nome;
    private double salario;

    // Construtor: inicializa o objeto com nome e salário
    public Exercicio1entities(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Getter: retorna o nome do empregado
    public String getNome() {
        return nome;
    }

    // Setter: altera o nome do empregado0
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter: retorna o salário atual
    public double getSalario() {
        return salario;
    }

    // Setter: altera o salário
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método que aumenta o salário com base em um percentual
    // Ex: percentual = 10 → aumenta 10%
    public void aumentarSalario(double percentual) {
        salario *= 1 + percentual / 100;
    }

    // Método que formata o salário para moeda local (ex: R$ 2000,00)
    public String formatarMoeda() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(); // define formato monetário
        nf.setMinimumFractionDigits(2); // garante duas casas decimais
        return nf.format(salario); // retorna o salário formatado
    }

    // Método para exibir os dados do empregado no console
    public void imprimir() {
        System.out.println("Nome: " + nome + ". Salário: " + formatarMoeda());
    }
}
