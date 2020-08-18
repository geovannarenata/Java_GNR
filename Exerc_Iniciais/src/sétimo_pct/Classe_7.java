package sétimo_pct;

import java.util.Scanner;

public class Classe_7 {
	
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, d, e, f, X, Y;
		
		System.out.println("Digite A: ");
		a = sc.nextInt();
		
		System.out.println("\nDigite B: ");
		b = sc.nextInt();
		
		System.out.println("\nDigite C: ");
		c = sc.nextInt();
		
		System.out.println("\nDigite D: ");
		d = sc.nextInt();
		
		System.out.println("\nDigite E: ");
		e = sc.nextInt();
		
		System.out.println("\nDigite F: ");
		f = sc.nextInt();
		
		X = (int) (c*e) - (d*f) / (a*e) - (b*d);
		
		Y = (int) (a*f) - (c*d) / (a*e) - (b*d);
		
		System.out.println("O valor de X é: " + Math.ceil(X) + " e o valor de Y é: " + Math.ceil(Y));
		
		sc.close();
		
	}

}
