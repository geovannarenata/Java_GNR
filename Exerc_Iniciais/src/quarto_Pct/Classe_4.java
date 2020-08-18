package quarto_Pct;

import java.util.Scanner;
import java.math.*;

public class Classe_4 {

	public static void main(String args[]) 
	
	{
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, D, R, S;
		
		System.out.println("Entre com A: ");
		A = sc.nextInt();
		
		System.out.println("Entre com B: ");
		B = sc.nextInt();
		
		System.out.println("Entre com C: ");
		C = sc.nextInt();
		
		R = (A+B) * (A+B);
		
		S = (B+C) * (B+C);
		
		D = (R + S) /2;
		
		System.out.println("A resposta é: " + D);
		
		
	}
	
}
