package exercicios;

public class Pessoa {
	
	private String nome;
	private String profissao;
	private String nacionalidade;
	private String passaporte;
	
	public Pessoa (String nomeP, String profissaoP, String nacionalidadeP, String passaporteP)
	{
		this.nome = nomeP;
		this.profissao = profissaoP;
		this.nacionalidade = nacionalidadeP;
		this.passaporte = passaporteP;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}

	
	
}
