package Exerc_1;

import java.util.Scanner;

public class primeiro_exerc {
	
	public static void main (String[] args) 
	{
				
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, maior;
		
		System.out.println("Insira o primeiro n�mero: ");
		a = sc.nextInt();
		System.out.println("Insira o segundo n�mero: ");
		b= sc.nextInt();
		System.out.println("Insira o terceiro n�mero: ");
		c = sc.nextInt();
		
		if( a > b && a > c) {
			
			System.out.println("O primeiro n�mero � o maior");
		} 
		else if (b > a && b > c) 
		{
			System.out.println("O segundo n�mero � o maior");
		}
		else 
		{
			System.out.println("O terceiro n�mero � o maior");
		}	
		
		sc.close();
	}
		
		
		
		
	}


