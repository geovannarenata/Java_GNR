package exercicios;

public class Fornecedor extends Class_Pessoa{
	
	private String cnpj;
	private String endere�o;
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor (String nome, String Id, String cnpj, String endere�o, double valorCredito, double valorDivida) 
	{
		super(nome, Id );
		this.cnpj = cnpj;
		this.endere�o = endere�o;
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo()
	{
		valorCredito = valorCredito - valorDivida;
		return valorCredito;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public String getEndereco()
	{
		return endere�o;
	}
	
	
}
