package exercicios;

public class Ins_Nativo extends Pessoa{
		
	private String endereco;
		
		public Ins_Nativo(String nomeP, String profissaoP, String nacionalidadeP, String passaporteP, String enderecoP)
		{
			super(nomeP, profissaoP, nacionalidadeP, passaporteP);
			this.endereco = enderecoP;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String enderecoP) {
			this.endereco = enderecoP;
		}
		
		
		

}

