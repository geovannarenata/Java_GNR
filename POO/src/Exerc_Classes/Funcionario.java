package Exerc_Classes;

public class Funcionario {
	
	private String matricula;
	private String nome;
	private String superior;
	private String setor;
	
	public Funcionario (String matriculaFunc, String nomeFunc, String superiorFunc, String setorFunc)
	{
		this.matricula = matriculaFunc;
		this.nome = nomeFunc;
		this.superior = superiorFunc;
		this.setor = setorFunc;
	}
	
	public String mostrarInfo()
	{
		String infoFunc = matricula + "\n" + nome + "\n" + superior + "\n" + setor + "\n";
		return infoFunc;
	}

}
