package exercícios;

public class Cavalo extends Animal{
	
	private String comport;
	private String relinchar;
	
	public Cavalo(String nome, int idade, String comport, String emitirSon, String relinchar)
	{
		super(nome, idade, emitirSon);
		this.comport =  comport;
		this.relinchar = relinchar;
	}
	
	public String getComport() 
	{
		return comport;
	}

	public void setComport(String comport) {
		this.comport = comport;
	}

	public String getRelinchar() {
		return relinchar;
	}

	public void setRelinchar(String relinchar) {
		this.relinchar = relinchar;
	}
	
	public String relinche()
	{
		String relinche = "hinn in in";
		return relinche;
	}
	
	
	

}
