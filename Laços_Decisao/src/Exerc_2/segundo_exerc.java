package Exerc_2;

import java.util.Scanner;

public class segundo_exerc {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Insira o primeiro n�mero: ");
		a = sc.nextInt();
		
		System.out.println("Insira o segundo n�mero: ");
		b = sc.nextInt();
		
		System.out.println("Insira o terceiro n�mero: ");
		c = sc.nextInt();
		
		if ( a> b && a >c ) 
		{
			if ( b > c  ) 
			{
				System.out.println("A sequ�ncia ficar�: " + a + ", " + b + ", " + c );
			}
			else if (c > b)
			{
				System.out.println("A sequ�ncia ficar�: " + a + ", " + c + ", " + b );
			}
		}
		else if ( b> c && b>a ) 
		{
			if ( c> a) 
			{
				System.out.println("A sequ�ncia ficar�: " + b + ", " + c + ", " + a );
			}
			else if( a> c)
			{
				System.out.println("A sequ�ncia ficar�: " + b + ", " + a + ", " + c );
			}
		}
		else if (c > a && c > b)
		{
			if (a > b )
			{
				System.out.println("A sequ�ncia ficar�: " + c + ", " + a + ", " + b );
			}
			else if( b > a)
			{
				System.out.println("A sequ�ncia ficar�: " + c + ", " + b + ", " + a );
			}
		}
			
		sc.close();
		
	}
}
