package Exerc_Classes;

public class Inst_Aviao {
	
	public static void main(String args[]) 
	{
		Aviao first_airplane = new Aviao("C�digo Voo: " + "0110" , "Nome do Piloto: " + "Roberto Luis ", "Nome do Copiloto: " + "Humberto Silva", "Nome Aeromo�a: " + "Joana Oliveira", "Destino: " + "It�lia");
		System.out.println(first_airplane.imprimirInformacoes());
		
		Aviao second_airplane = new Aviao("C�digo Voo: " + "0140" , "Nome do Piloto: " + "Melissa Kakovczt ", "Nome do Copiloto: " + "Jorge Lucas", "Nome Aeromo�a: " + "Fl�via Locatelli", "Destino: " + "Sofia");
		System.out.println(second_airplane.imprimirInformacoes());
		
	}

}
