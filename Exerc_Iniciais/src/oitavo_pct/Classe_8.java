package oitavo_pct;

import java.util.Scanner;

public class Classe_8 {

	public static void main(String args[])
	{
		
			Scanner sc = new Scanner(System.in);
			
			double cc, cf;
			System.out.println("Digite o custo do fabricante : ");
			cf = sc.nextDouble();
			
			cc = (cf * 1.73); /* soma dos impostos mais porcentagem */
			
			System.out.println("O custo para o consumidor é de : "+cc);
			
			sc.close();
					
					
		}
		
		
	}

