package Exerc_4;

import java.util.Scanner;

public class quarto_exerc {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Insira um número: ");
		num = sc.nextInt();
		
		if ( num % 2 == 0 && num >0 ) 
		{
			System.out.println("Este número é par: " + num + "\nSua raiz quadrada é:  " + Math.sqrt(num));
		}
		else 
		{
			System.out.print("Este número é Ímpar: " + num + "\nSua potência é: " + (num * num) );
		}
	}

}
