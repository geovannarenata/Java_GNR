package Exerc_Classes;

public class Eletronicos {
	
	private String codigo;
	private String nome;
	private String tipo;
	private String segmento;
	
	
	public Eletronicos (String codProd, String nomeProd, String tipoProd, String segmentoProd)
	{
		this.codigo = codProd;
		this.nome = nomeProd;
		this.tipo = tipoProd;
		this.segmento = segmentoProd;
	}
	
	public String infoProduto() 
	{
		String informacoesProd = codigo + "\n" + nome + "\n" + tipo + "\n" + segmento + "\n";
		return informacoesProd;
	}

}
