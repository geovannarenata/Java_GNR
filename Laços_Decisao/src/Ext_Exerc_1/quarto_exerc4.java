package Ext_Exerc_1;

import java.util.Scanner;

public class quarto_exerc4 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int A, B, C;
		
		System.out.println("Insira o número: ");
		A = sc.nextInt();
		
		System.out.println("Insira o segundo número: ");
		B = sc.nextInt();
		
		if ( A == B) {
			
			C = A + B;
		}
		else 
		{
			C = A * B;
		}
		
		System.out.println("O resultado foi: " + C);
	}

}
