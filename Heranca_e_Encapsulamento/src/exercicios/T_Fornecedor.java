package exercicios;

import java.util.Scanner;

public class T_Fornecedor {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Fornecedor primeiroForn = new Fornecedor("Argos LTDA", "10120", "14541541241/0001", "Rua dos Alecrins", 3500, 2120);
		{
			System.out.println("Nome do Fornecedor: " + primeiroForn.getNome());
			System.out.println("ID: " + primeiroForn.getId());
			System.out.println("CNPJ: " + primeiroForn.getCnpj());
			System.out.println("Endere�o: " + primeiroForn.getEndereco());
			System.out.println("Valor de Cr�dito: " + primeiroForn.getValorCredito());
			System.out.println("Valor da D�vida: " + primeiroForn.getValorDivida());
			System.out.println("\n");
			System.out.println("Saldo de Cr�dito restante: " + primeiroForn.obterSaldo());
			
		
			
			
		}
	
	

	}
	
}
