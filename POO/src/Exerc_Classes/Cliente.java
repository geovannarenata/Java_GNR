package Exerc_Classes;

public class Cliente {
	
	private String cpf;
	private String nome;
	private String sexo;
	private String tipo;
	private String produto;

	
	public Cliente (String cpfcliente, String nomeCompleto, String sexoCli, String tipoCli, String produtoComprado) 
	{
		this.cpf = cpfcliente;
		this.nome = nomeCompleto;
		this.sexo = sexoCli;
		this.tipo = tipoCli;
		this.produto = produtoComprado;
	}

	public String imprimirInfo()
	{
			String informacoes = cpf + "\n" + nome + "\n" + sexo + "\n" + tipo + "\n" + produto + "\n";
			return informacoes;
			
	}
	
	

	
}