package Exerc_Classes;

public class Aviao {

	private String codigo;
	private String piloto;
	private String copiloto;
	private String aeromoca;
	private String destino;
	
	public Aviao (String codVoo, String nomePiloto, String nomeCPiloto, String nomeAeromoca, String destinoVoo) 
	{
		this.codigo = codVoo;
		this.piloto = nomePiloto;
		this.copiloto = nomeCPiloto;
		this.aeromoca = nomeAeromoca;
		this.destino = destinoVoo;
	}
	
	public String imprimirInformacoes() 
	{
		String informacoesVoo = codigo + "\n" + piloto + "\n" + copiloto + "\n" + aeromoca + "\n" + destino + "\n";
		return informacoesVoo;
	}
}
