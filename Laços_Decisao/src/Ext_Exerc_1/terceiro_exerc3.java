package Ext_Exerc_1;

import java.util.Scanner;

public class terceiro_exerc3 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Insira um n�mero: ");
		numero = sc.nextInt();
		
		if ( numero % 2 ==0 ) 
		{
			System.out.println("� par");
		}
		else 
		{
			System.out.println("� �mpar");
		}
		
		sc.close();
	}

}
