package Exercicios_LR;

import java.util.Scanner;

public class exerc_1 {

	public static void main(String args[])
	{
		int x;
		
		for (x=1000; x<=1999; x++)
		{
			if (x % 11 == 5)
			{
				System.out.println("É divisível por 11 e o resto é 5 : " + x);
			}
		}
		
	}
}
