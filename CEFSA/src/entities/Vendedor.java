package entities;

public class Vendedor extends Funcionario {

	private double comissao;

	public Vendedor(String nome, int idade, String cargo, double salario, double comissao) {
		super(nome, idade, cargo, salario);
		this.comissao = comissao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Comissão: " + comissao);
		System.out.println("------------------------");
	}

}
