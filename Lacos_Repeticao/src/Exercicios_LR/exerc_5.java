package Exercicios_LR;

import java.util.Scanner;

public class exerc_5 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num, soma=0;
		
		System.out.println("Insira um número: ");
		num = sc.nextInt();
		
		do {
			
			soma = soma +num;
			System.out.println("Insira um número: ");
			num = sc.nextInt();
			
		}
		while (num != 0);
		
		System.out.println("A soma dos números digitados é: " + soma);
	}

}
