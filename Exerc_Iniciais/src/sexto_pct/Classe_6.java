package sexto_pct;

import java.util.Scanner;
import java.math.*;

public class Classe_6 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		double x1, x2, y1, y2, distancia, A, B, C ;
		
		System.out.println("Digite o x1: ");
		x1 = sc.nextInt();
		
		System.out.println("Digite o x2: ");
		x2 = sc.nextInt();
		
		System.out.println("Digite o y1: ");
		y1 = sc.nextInt();
		
		System.out.println("Digite o y2: ");
		y2 = sc.nextInt();
		
		A = (x2 - x1) * (x2 - x1);
		
		B = (y2 - y1) * (y2 - y1);
		
		C = A + B;
		
		distancia = Math.sqrt(C);
		
		System.out.println("\nO valor da distância entre os pontos é: " + Math.ceil(distancia));
		
		sc.close();
		
		
		
	}

}
