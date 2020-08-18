package Exerc_Classes;

public class Inst_Aviao {
	
	public static void main(String args[]) 
	{
		Aviao first_airplane = new Aviao("Código Voo: " + "0110" , "Nome do Piloto: " + "Roberto Luis ", "Nome do Copiloto: " + "Humberto Silva", "Nome Aeromoça: " + "Joana Oliveira", "Destino: " + "Itália");
		System.out.println(first_airplane.imprimirInformacoes());
		
		Aviao second_airplane = new Aviao("Código Voo: " + "0140" , "Nome do Piloto: " + "Melissa Kakovczt ", "Nome do Copiloto: " + "Jorge Lucas", "Nome Aeromoça: " + "Flávia Locatelli", "Destino: " + "Sofia");
		System.out.println(second_airplane.imprimirInformacoes());
		
	}

}
