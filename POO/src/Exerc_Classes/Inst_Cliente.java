package Exerc_Classes;

public class Inst_Cliente {
	
	public static void main(String args[]) 
	{
		Cliente first_client = new Cliente("CPF: " + "14214214255", "Nome:" + "Geovanna", "Sexo: " + "Feminimo", "Tipo: " + "Pessoa Física", "Produto: " + "Chocolate");
		System.out.println(first_client.imprimirInfo());
		
		Cliente second_client = new Cliente("CPF: " + "14214214255", "Nome:" + "Maria", "Sexo: " + "Feminimo", "Tipo: " + "Pessoa Física", "Produto: " + "Farinha de Trigo");
		System.out.println(second_client.imprimirInfo());
		
		Cliente third_client = new Cliente("CPF: " + "14214214255", "Nome:" + "Tereza", "Sexo: " + "Feminimo", "Tipo: " + "Pessoa Física", "Produto: " + "Bolo");
		System.out.println(third_client.imprimirInfo());
		
		
	}
}
