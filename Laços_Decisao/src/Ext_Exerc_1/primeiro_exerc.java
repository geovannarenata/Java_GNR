package Ext_Exerc_1;

import java.util.Scanner;

public class primeiro_exerc {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, soma;
		
		System.out.println("Insira o primeiro N�: ");
		a = sc.nextInt();
		System.out.println("Insira o segundo N�: ");
		b = sc.nextInt();
		System.out.println("Insira o terceiro N�: ");
		c = sc.nextInt();
		
		soma = a + b;
		
		if (soma < c) 
		{
			System.out.println("A soma dos n�meros � menor que o �ltimo n�mero" + "\nPrimeiro N�: " + a + "| Segundo N�: " + b + "| Terceiro N�: " + c + "\nSoma: " + soma);
		}
		else 
		{
			System.out.println("A soma dos primeiros n�meros � maior que o �ltimo n�mero" + "\nPrimeiro N�: " + a + "\nSegundo N�: " + b + "\nTerceiro N�: " + c + "\nSoma: " + soma);
		}
		
		sc.close();
	}

}
