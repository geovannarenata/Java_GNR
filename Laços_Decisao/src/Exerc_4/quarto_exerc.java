package Exerc_4;

import java.util.Scanner;

public class quarto_exerc {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Insira um n�mero: ");
		num = sc.nextInt();
		
		if ( num % 2 == 0 && num >0 ) 
		{
			System.out.println("Este n�mero � par: " + num + "\nSua raiz quadrada �:  " + Math.sqrt(num));
		}
		else 
		{
			System.out.print("Este n�mero � �mpar: " + num + "\nSua pot�ncia �: " + (num * num) );
		}
	}

}
