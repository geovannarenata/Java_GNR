package Exercicios_LR;

import java.util.Scanner;

public class exerc_2 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
	int x, y, contp=0, conti=0;
	
	
		for(x=0; x < 10; x++ ) 
		{
			System.out.println("Insira um número: ");
			y = sc.nextInt();
			
		if (y % 2 == 0 ) 
		{
			contp++;
		}
		else 
		{
			conti++;
		}

		}
		
		System.out.println("\nA quatidade de N°s pares é " + contp + "\nA quantidade de N°s ímpares é " + conti);
	}
}
