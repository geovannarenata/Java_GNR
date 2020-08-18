package exerc�cios;

public class Pregui�a extends Animal{
	
	private String comport;
	private String ruido;
	
	public Pregui�a(String nome, int idade, String comport, String emitirSon, String ruido) 
	{
		super(nome, idade, emitirSon);
		this.comport =  comport;
		this.ruido = ruido;
	}
	
	public String ruido()
	{
		return ruido;
	}

	public String getComport() {
		return comport;
	}

	public void setComport(String comport) {
		this.comport = comport;
	}

	public String getRuido() {
		return ruido;
	}

	public void setRuido(String ruido) {
		this.ruido = ruido;
	}
	
	

}
