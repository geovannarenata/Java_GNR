package exerc�cios;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Loja {
	
	public static void main(String args[])
	{
		List<String> estoque = new ArrayList<String>();
		
		estoque.add("Cal�a Jeans        \tTamanhos P, M e G");
		estoque.add("Blusa Manga Longa    \tTamanhos PP, P e M");
		estoque.add("Shorts            \tTamamhos G e GG");
		estoque.add("Blusa Mang Curta    \tTamanho P, M, G e GG ");
		estoque.add("Meias");
		estoque.add("Luvas");
		
		System.out.println("\tEst� dispon�vel em estoque: ");
		for (String listaEstoque : estoque) 
		{
			System.out.println(listaEstoque);
		}
		
		System.out.println("------------- Fechamento da Loja -------------- ");
		System.out.println("\n");
		System.out.println("------- Atualiza��o do Estoque  -------");
		System.out.println("\n");
		estoque.remove("Meias");
		estoque.remove("Luvas");
		
		System.out.println("\tEst� dispon�vel em estoque: ");
		for (String listaEstoque : estoque) 
		{
			System.out.println(listaEstoque);
		}

	}

}
