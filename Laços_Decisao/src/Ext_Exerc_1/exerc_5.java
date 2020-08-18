package Ext_Exerc_1;

import java.util.Scanner;

public class exerc_5 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Insira um número: ");
		num = sc.nextInt();
		
		if ( num >= 0 ) 
		{
			num = num *2;
		}
		else 
		{
			num = num * 3;
		}
		
		System.out.println("O resultado foi: " + num);
		
		sc.close();
		
	}

}
