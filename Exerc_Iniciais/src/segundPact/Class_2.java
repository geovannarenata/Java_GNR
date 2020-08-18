package segundPact;

import java.util.Scanner;

public class Class_2 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade, anos, meses, dias;
		System.out.println("Informe sua idade em dias: ");
		dias = sc.nextInt();
		
		
		anos = (dias/365);
		
		meses = (dias%365)/30;
		
		dias = (dias%365)/30;
		
		idade = anos + meses + dias;
		
		System.out.println("Sua idade expressa em anos é: " + anos + " anos" );
		System.out.println("Sua idade expressa em meses é: " + meses + " meses");
		System.out.println("Sua idade expressa em dias é: " + dias + " dias");
		
		sc.close();
		
	}

}
