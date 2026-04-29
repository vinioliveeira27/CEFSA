package entities;

public class Gerente extends Funcionario {
	private double bonus;

	public Gerente(String nome, int idade, String cargo, double salario,double bonus) {
		super(nome, idade, cargo, salario);
		this.bonus=bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Comissão: " + bonus);
		System.out.println("------------------------");
	}

}
