package exerc�cios;

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
		
		Cavalo Fr�sio = new Cavalo("Horse", 12, "Trotar", "Relinchar", "hinn in in");
		{
			System.out.println("Nome do Cavalo: " + Fr�sio.getNome());
			System.out.println("Idade: : " + Fr�sio.getIdade());
			System.out.println("Comportamento emitido: " + Fr�sio.getComport());
			System.out.println("Som emitido: " + Fr�sio.getRelinchar());
			System.out.println(Fr�sio.relinche());
			System.out.println("\n -------- Fim da ficha ------------");
		}
		
		Pregui�a preguica = new Pregui�a("Preg", 9, "Subir em �rvores", "Ru�do", "Inaud�vel");
		{
			System.out.println("Nome da Pregui�a: " + preguica.getNome());
			System.out.println("Idade: : " + preguica.getIdade());
			System.out.println("Comportamento emitido: " + preguica.getComport());
			System.out.println("Som emitido: " + preguica.getRuido());
			System.out.println(preguica.ruido());
			System.out.println("\n -------- Fim da ficha ------------");
		}
		
	
	}

}
