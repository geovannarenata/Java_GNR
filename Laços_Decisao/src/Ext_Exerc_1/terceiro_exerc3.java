package Ext_Exerc_1;

import java.util.Scanner;

public class terceiro_exerc3 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Insira um número: ");
		numero = sc.nextInt();
		
		if ( numero % 2 ==0 ) 
		{
			System.out.println("É par");
		}
		else 
		{
			System.out.println("É Ímpar");
		}
		
		sc.close();
	}

}
