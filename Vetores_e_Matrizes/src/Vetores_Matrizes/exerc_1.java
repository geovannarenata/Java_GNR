package Vetores_Matrizes;

import java.util.Scanner;

public class exerc_1 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] A= {1, 0, 5, -2, -5, 7};
		
		int soma = A[0] + A[1] + A[5];
		
		System.out.println("A soma dos fatores A[0] + A[1] + A[5] é : " + soma);
		
		
		A[4] = 100;
		System.out.println("A posição A[4] fora modificada para: " + A[4]);
		
		for (int i=0; i < 6 ; i++ ) {
			System.out.println("\nOs valores de A são: " + A[i]);
		}
		
	}
	
}
