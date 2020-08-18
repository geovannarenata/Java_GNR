package exercicios;

import java.util.Scanner;

public class T_Nativo {
	
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		String validade;
		
		Ins_Nativo Nativo_1 = new Ins_Nativo("Nome: " + "Jorge Amado", "Profissão: " + "Escritor", "Nacionalidade: " + " Brasileiro", "Passaporte: " + "Pendente", "Endereço: " + "Rua Beco do Poeta");
		System.out.println(Nativo_1.getNome());
		System.out.println(Nativo_1.getProfissao());
		System.out.println(Nativo_1.getNacionalidade());
		System.out.println(Nativo_1.getPassaporte());
		System.out.println(Nativo_1.getEndereco());
		
		Ins_Imigrante Imigrante_1 = new Ins_Imigrante("\nNome: " + "Mia Couto", "Profissão: " + "Escritor", "Nacionalidade: " + "Angolano", "Passaporte: " + "Emitido", "Registro Nacional Migratório:  " + "1201042", false);
		System.out.println(Imigrante_1.getNome());
		System.out.println(Imigrante_1.getProfissao());
		System.out.println(Imigrante_1.getNacionalidade());
		System.out.println(Imigrante_1.getPassaporte());
		System.out.println(Imigrante_1.getRNM());
		System.out.println("\n");
	/*	System.out.println("Seu passaporte está dentro do período de validade? (Sim ou Não) ");
		validade = sc.toString(); */
		
		
	
	}

}
