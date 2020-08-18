package Vetores_Matrizes;

import java.util.Scanner;

public class correc_2 {
	
	public static void main(String args[])
	{
		int vetor[] = new int[6], somaPar=0, quantImpar=0;
		Scanner sc = new Scanner(System.in);
		
		for (int x=0; x <6; x++) {
			System.out.printf("Entre com um valor: ");
			vetor[x] = sc.nextInt();
			
			if(vetor[x]%2==0) {
				
				System.out.printf("Valor par: " + vetor[x]);
				somaPar = somaPar + vetor[x];
			}
			else {
				System.out.printf("Valor ímpar: " + vetor[x]);
				quantImpar++;
			}
			
			System.out.println("Somatório dos números pares: "+somaPar);
			System.out.println("Quantidade de número ímpares: "+quantImpar);
			
		}
	}

}
