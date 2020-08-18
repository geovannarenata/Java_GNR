package Exerc_3;

import java.util.Scanner;

public class terceiro_exerc {
	
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.println("insira sua idade: ");
		idade = sc.nextInt();
		
		if (idade >= 10 && idade <=14 ) { 
			System.out.println("Você pertence à categoria Infantil");
		}
		else if ( idade >= 15 && idade <= 17) {
			System.out.println("Você pertence à categoria Juvenil");
		}
		else if( idade >= 18 && idade <= 28) {
			System.out.println("Você pertence à categoria Adulto");
		}
		else
		{
			System.out.println("Sua categoria ainda não foi incluída!");
			
		}
		
		sc.close();
	}

}
