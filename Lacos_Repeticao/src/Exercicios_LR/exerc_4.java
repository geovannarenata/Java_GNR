package Exercicios_LR;

import java.util.Scanner;

//sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2, 
//se a pessoa era nervosa e 3, se a pessoa era agressiva). 
//Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: 
//•	o número de pessoas calmas; 
//•	o número de mulheres nervosas; 
//•	o número de homens agressivos; 
//•	o número de outros calmos;
//•	o número de pessoas nervosas com mais de 40 anos; 
//•	o número de pessoas calmas com menos de 18 anos.



public class exerc_4 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);		
		
		int idade, sexo, comport, contpessoa=0, contF=0, contM=0, contO=0, contNer=0, contCal=0, contAgr=0, mulherN=0, homensA=0;
		int outrosCal=0, pessoaM40=0, pessoasCalmasMenos18=0; 
		
		System.out.println("Insira sua idade: ");
		idade = sc.nextInt();
		while (idade <= 0 || idade >= 130)
		{
			System.out.println("Opção inválida! \nInsira sua idade:  ");
			idade = sc.nextInt();
		}
		
		while (contpessoa <= 150)
		{	
		// Sexo
			System.out.println("Seu sexo é: \n1 -- Feminino \n2 -- Masculinoe \n3 -- Outros");
			sexo = sc.nextInt();
			if (sexo == 1 ) 
			{
				contF++;
			}
			else if (sexo == 2) 
			{
				contM++;
			}
			else if (sexo == 3) 
			{
				contO++;
			}
			else
			{
				while( sexo <=0 || sexo > 3) {
				System.out.println("Opção inválida! \nEscolha uma das opções: \n1 -- Feminino \n2 -- Masculino \n3 -- Outros ");
				sexo = sc.nextInt();
				}
			}			
			
		// Comportamento 
			System.out.println("Você é uma pessoa: \n1 -- Calma \n2 -- Nervosa \n3 -- Agressiva");
			comport = sc.nextInt();
			if (comport == 1 ) 
			{
				contCal++;
			}
			else if (comport == 2) 
			{
				contNer++;
			}
			else if (comport == 3) 
			{
				contAgr++;
			}
			else
			{
				while (comport <=0 || comport > 3) {
				System.out.println("Opção inválida! \nEscolha uma das opções: \n1 -- Calma \n2 -- Nervosa \n3 -- Agressiva ");
				comport = sc.nextInt();
				}
				
			}
			
			if(sexo == 1 && comport == 2)
			{
				mulherN++;
			}
			
			if ( sexo == 2 && comport == 3)
			{
				homensA++;
			}
			
			if (sexo == 3 && comport == 1)
			{
				outrosCal++;
			}
			
			if ( idade >= 40 && comport == 2) 
			{
				pessoaM40++;
			}
			
			if (idade <=18 && comport == 1)
			{
				pessoasCalmasMenos18++;
			}
			
			System.out.println("Pessoas calmas: " + contCal);
			System.out.println("Mulheres nervosas: " + mulherN );
			System.out.println("Homens agressivos: " + homensA );
			System.out.println("Outros calmos: " + outrosCal);
			System.out.println("Pessoas Nervosas com +40: " + pessoaM40);
			
			
			contpessoa++;
			System.out.println("N° de participantes: " + contpessoa);
			
			System.out.println("\nInsira sua idade: ");
			idade = sc.nextInt();			
			
		}
		
		
	}

}
