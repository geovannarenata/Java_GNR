package exercicios;

public class Class_Pessoa {
	
	private String nome;
	private String Id;
	
	
	public Class_Pessoa (String nome, String Id) 
	{
		this.nome = nome;
		this.Id = Id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}
	

}
