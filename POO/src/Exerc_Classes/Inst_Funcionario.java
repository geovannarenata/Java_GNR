package Exerc_Classes;

public class Inst_Funcionario {
	
	public static void main(String args[]) 
	{
		Funcionario first_func = new Funcionario("Matr�cula: " + "40539", "Nome do Funcion�rio: " + "Geovanna Renata", "Superior direto: " + "Viviane", "Setor: " + "Recursos Humanos");
		System.out.println(first_func.mostrarInfo());
		
		Funcionario second_func = new Funcionario("Matr�cula: " + "40540", "Nome do Funcion�rio: " + "Juan Sousa", "Superior direto: " + "Marcelo", "Setor: " + "Contabilidade");
		System.out.println(second_func.mostrarInfo());
	}

}
