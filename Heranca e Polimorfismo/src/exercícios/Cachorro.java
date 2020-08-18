package exercícios;

public class Cachorro extends Animal {

	private String comport;
	private String latir;
	
	public Cachorro (String nome, int idade, String comport, String emitirSom, String latir) 
	{
		super(nome, idade, emitirSom);
		this.comport = comport;
		this.latir = latir;
	}

	public String getComport() {
		return comport;
	}

	public void setComport(String comport) {
		this.comport = comport;
	}
	
	public String latir()
	{
		return latir;
	}
}
