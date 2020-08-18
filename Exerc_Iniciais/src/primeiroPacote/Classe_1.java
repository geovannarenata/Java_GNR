package primeiroPacote;

import java.util.Scanner;

public class Classe_1 {
	
	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		int idade, dias, meses, anos;
		
		System.out.println("Informe sua idade em anos: ");
		anos = ler.nextInt();
		
		System.out.println("Quantos meses tem? ");
		meses = ler.nextInt();
		
		System.out.println("Quantos dias tem?");
		dias = ler.nextInt();
		
		idade = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("\nSua idade expressa em anos é: " + idade);
				
		
	}
}
