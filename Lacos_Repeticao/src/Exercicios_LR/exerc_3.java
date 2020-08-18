package Exercicios_LR;

import java.util.Scanner;

public class exerc_3 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
				
		int idade, menosVU=0, maisCinq=0;
		
		System.out.println("Insira sua idade: ");
		idade = sc.nextInt();
		
		while ( idade <= 99) {
			if ( idade <= 21 ) 
			{
				menosVU++;
			}
			else if (idade >= 50)
			{
				maisCinq++;
			}
		
		System.out.println("Insira sua idade: ");
		idade = sc.nextInt();
		
		}
		
	 System.out.println("Total de pessoas com menos de 21 anos: " + menosVU + "\nTotal de pessoas com mais de 50 anos: " + maisCinq);
		
		
	}

}
