package Exerc_Classes;

public class Inst_Eletronico {
	
	public static void main(String args[])
	{
		Eletronicos produto_1 = new Eletronicos("Código do Produto: " + "1501", "Nome do Produto: " + "Celular Samsung S10", "Tipo do Produto: " + "Portátil", "Segmnento do Produto: " + "Celulares");
		System.out.println(produto_1.infoProduto());
		
		Eletronicos produto_2 = new Eletronicos("Código do Produto: " + "2054", "Nome do Produto: " + "Notebook Dell 15-5000", "Tipo do Produto: " + "Portátil", "Segmnento do Produto: " + "Notebooks");
		System.out.println(produto_2.infoProduto());
		
		Eletronicos produto_3 = new Eletronicos("Código do Produto: " + "3568", "Nome do Produto: " + "TV Smart 51220", "Tipo do Produto: " + "Eletrodoméstico", "Segmnento do Produto: " + "Televisores");
		System.out.println(produto_3.infoProduto());
	}

}
