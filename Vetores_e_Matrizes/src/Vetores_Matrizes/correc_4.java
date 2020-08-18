package Vetores_Matrizes;

import java.util.Scanner;

public class correc_4 {

	public static void main(String args[]) {
		
		float m1[][] = new float[2][2];
		float m2[][] = new float[2][2];
		float m3[][] = new float[2][2];
		float valor;
		int op;
		
		Scanner sc = new Scanner(System.in);
		
		for ( int ln=0; ln <2; ln++)
		{
			for (int cl=0; cl <2; cl++) 
			{
				System.out.println("Matriz 1: ");
				m1[ln][cl] = sc.nextFloat();
				
				System.out.println("Matriz 2: ");
				m2[ln][cl] = sc.nextFloat();
			}
		}
		
		System.out.println("1 -- Soma as matrizes \n2 -- Subtrai as matrizes \n3 -- Adiciona a constante \n4 -- Imprime as matrizes");
		op = sc.nextInt();
		switch (op) {
		
		case 1:
			
			for ( int ln=0; ln <2; ln++)
			{
				for (int cl=0; cl <2; cl++) 
				{
					m3[ln][cl] = m1[ln][cl] + m2[ln][cl];
					System.out.println("Soma das matrizes: " + m3[ln][cl]);
				}
			}
			
			break;
		
		case 2: 
			
			for ( int ln=0; ln <2; ln++)
			{
				for (int cl=0; cl <2; cl++) 
				{
					m3[ln][cl] = m2[ln][cl] - m1[ln][cl];
					System.out.println("Soma das matrizes: " + m3[ln][cl]);
				}
			}
			break;
			
		case 3:
			
			System.out.println("Digite o valor da constante: ");
			valor = sc.nextFloat();
			for ( int ln=0; ln <2; ln++)
			{
				for (int cl=0; cl <2; cl++) 
				{
					m1[ln][cl] = m1[ln][cl] + valor;
					System.out.println("Matriz 1: " + m1[ln][cl]);
					m2[ln][cl] = m1[ln][cl] + valor;
					System.out.println("Matriz 2: " + m2[ln][cl]);
				}
			}
			break;
			
		case 4: 
			
			for ( int ln=0; ln <2; ln++)
			{
				for (int cl=0; cl <2; cl++) 
				{
					System.out.println("Matriz 1: " + m1[ln][cl]);
	
				}
			}
			
			for ( int ln=0; ln <2; ln++)
			{
				for (int cl=0; cl <2; cl++) 
				{
					System.out.println("Matriz 2: " + m2[ln][cl]);
				}
			}
			break;
		default: 
				System.out.println("Opção inválida!!");

			
		}
		
	}
	
}
