package Exercicios_LR;

import java.util.Scanner;

public class exerc_5 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num, soma=0;
		
		System.out.println("Insira um n�mero: ");
		num = sc.nextInt();
		
		do {
			
			soma = soma +num;
			System.out.println("Insira um n�mero: ");
			num = sc.nextInt();
			
		}
		while (num != 0);
		
		System.out.println("A soma dos n�meros digitados �: " + soma);
	}

}
