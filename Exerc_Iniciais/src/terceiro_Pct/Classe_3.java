package terceiro_Pct;

import java.util.Scanner;

public class Classe_3 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
				
		int tempo, horas, minutos, segundos;
		
		System.out.println("Informe o tempo de duração do evento: ");
		tempo = sc.nextInt();
		
		horas = (tempo/3600);
		minutos = (tempo%3600)/60;
		segundos = (tempo%3600)/60;
		
		System.out.println("O tempo de duração em horas foi: " + horas + " horas" + minutos + (" minutos e " + segundos + " segundos"));
		
		
		sc.close();
		
		
	}
}
