package exercicios;

public class Empregado extends Class_Pessoa{
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nome, String Id, int codigoSetor, double salarioBase, double imposto)
	{
		super(nome, Id);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public double calcularSalario()
	{
		double salario = salarioBase * (1-(imposto/100));
		return salario;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	
	
	
}
