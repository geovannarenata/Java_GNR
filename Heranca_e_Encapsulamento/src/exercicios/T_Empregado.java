package exercicios;

import java.util.Scanner;

public class T_Empregado {

	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		Empregado primeiroEmp = new Empregado("Maria Julia", "14210", 142, 4520.50, 20);
		{
			System.out.println("Nome do Empregado(a): " + primeiroEmp.getNome());
			System.out.println("ID: " + primeiroEmp.getId());
			System.out.println("Código do Setor: " + primeiroEmp.getCodigoSetor());
			System.out.println("Salário Base: " + primeiroEmp.getSalarioBase());
			System.out.println("Valor dos impostos sobre o Salário: " + primeiroEmp.getImposto() + "%");
			System.out.println("Valor do Salário Final: " + primeiroEmp.calcularSalario());
			
			System.out.println("---------------- Fim da Execução -----------------");

		}
		
		Empregado segundoEmp = new Empregado("Theo Finnoti", "145274", 145, 2758.50, 10);
		{
			System.out.println("Nome do Empregado(a): " + segundoEmp.getNome());
			System.out.println("ID: " + segundoEmp.getId());
			System.out.println("Código do Setor: " + segundoEmp.getCodigoSetor());
			System.out.println("Salário Base: " + segundoEmp.getSalarioBase());
			System.out.println("Valor dos impostos sobre o Salário: " + segundoEmp.getImposto() + "%");
			System.out.println("Valor do Salário Final: " + segundoEmp.calcularSalario());
			
			System.out.println("---------------- Fim da Execução -----------------");

		}
		
	}
}
