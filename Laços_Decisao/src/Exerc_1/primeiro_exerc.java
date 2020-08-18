package Exerc_1;

import java.util.Scanner;

public class primeiro_exerc {
	
	public static void main (String[] args) 
	{
				
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, maior;
		
		System.out.println("Insira o primeiro número: ");
		a = sc.nextInt();
		System.out.println("Insira o segundo número: ");
		b= sc.nextInt();
		System.out.println("Insira o terceiro número: ");
		c = sc.nextInt();
		
		if( a > b && a > c) {
			
			System.out.println("O primeiro número é o maior");
		} 
		else if (b > a && b > c) 
		{
			System.out.println("O segundo número é o maior");
		}
		else 
		{
			System.out.println("O terceiro número é o maior");
		}	
		
		sc.close();
	}
		
		
		
		
	}


