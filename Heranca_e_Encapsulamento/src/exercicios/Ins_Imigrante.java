package exercicios;

public class Ins_Imigrante extends Pessoa { 
	
	private String RNM;
	private boolean pedido_passaporte;
	
	public Ins_Imigrante(String nome, String profissao, String nacionalidade, String passaporte, String registroImig, boolean validade)
	{
		super(nome, profissao, nacionalidade, passaporte);
		this.RNM = registroImig;
		this.pedido_passaporte = validade;
	}

	public String getRNM() {
		String registro = RNM;
		return RNM;
	}

	public void setRNM(String rNM)
	{
		RNM = rNM;
	}
	
	

}
