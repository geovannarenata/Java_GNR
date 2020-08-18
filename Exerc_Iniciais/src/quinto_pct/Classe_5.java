package quinto_pct;

import java.util.Scanner;

public class Classe_5 {
	
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		int  A, B, C, media;
		
		System.out.println("Digite a primeira nota: ");
		A = sc.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		B = sc.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		C = sc.nextInt();
		
		media = (A *2 ) + (B*3) + (C*5) / 13;
		
		System.out.println("Sua nota final foi: " + media);
		
		sc.close();
		
		
		
	}
	
}
