package Ext_Exerc_1;

import java.util.Scanner;

public class segundo_exerc2 {
	
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		String nome, sexo, estCivil;
		
		System.out.println("Insira seu nome: ");
		nome = sc.toString();
		
		System.out.println("Seu sexo �: ");
		sexo = sc.toString();
		
		System.out.println("Qual seu Estado Civil?");
		estCivil = sc.toString();
		
		if (sexo =="F" && estCivil == "Casada")
		{
			System.out.println("H� quanto tempo est� casada?");
		}
		else {
			System.out.println("Obrigada pelas informa��es");
		}
	}

}
