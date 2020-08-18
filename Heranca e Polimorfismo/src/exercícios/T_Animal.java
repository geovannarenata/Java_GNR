package exercícios;

import java.util.Scanner;

public class T_Animal {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Cachorro pinscher = new Cachorro("Billy", 11, "Correr", "Latido", "au au au au");
		{
			System.out.println("Nome do Cachorro: " + pinscher.getNome());
			System.out.println("Idade: : " + pinscher.getIdade());
			System.out.println("Comportamento emitido: " + pinscher.getComport());
			System.out.println("Som emitido: " + pinscher.getEmitirSom());
			System.out.println(pinscher.latir());
			System.out.println("\n -------- Fim da ficha ------------");
		}
		
		Cavalo Frísio = new Cavalo("Horse", 12, "Trotar", "Relinchar", "hinn in in");
		{
			System.out.println("Nome do Cavalo: " + Frísio.getNome());
			System.out.println("Idade: : " + Frísio.getIdade());
			System.out.println("Comportamento emitido: " + Frísio.getComport());
			System.out.println("Som emitido: " + Frísio.getRelinchar());
			System.out.println(Frísio.relinche());
			System.out.println("\n -------- Fim da ficha ------------");
		}
		
		Preguiça preguica = new Preguiça("Preg", 9, "Subir em árvores", "Ruído", "Inaudível");
		{
			System.out.println("Nome da Preguiça: " + preguica.getNome());
			System.out.println("Idade: : " + preguica.getIdade());
			System.out.println("Comportamento emitido: " + preguica.getComport());
			System.out.println("Som emitido: " + preguica.getRuido());
			System.out.println(preguica.ruido());
			System.out.println("\n -------- Fim da ficha ------------");
		}
		
	
	}

}
