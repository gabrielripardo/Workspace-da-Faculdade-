/**
 * @nome: Dados_funcionario.jar
 * @Função: Construa uma classe que peça o Nome, Endereço, Sexo, Cidade, Estado, Idade dos funcionários. Além disto, 
 * dado o Salário Bruto do funcionário, calcule o seu Salário Líquido. Considere que os descontos podem ser o Vale 
 * Transporte (2%), Vale Alimentação (5%) e Plano de Saúde (10%). 
 * @author: Gabriel Ripardo 
 * @Data_de_criação: 12/04/2017
 */

package exercicios_6FluxodeControle;

public class Funcionario {
	private String nome;
	private String endereco;
	private String sexo;
	private String cidade;
	private String estado;
	private int idade;
	private float salBruto;
	
	public float getLiquid(){
		float salLiq = salBruto - ((0.02f + 0.05f + 0.1f) * salBruto);
		return salLiq;
	}
	public void setLiquid(float salBruto){
		this.salBruto = salBruto;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco(){
		return endereco;
	}
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public String getSexo(){
		switch(sexo){
		case "f": 
			sexo = "feminino";
		case "m":
			sexo = "masculino";
		//default:
		//	mysex = "Caractere desconhecido!";
		}
		return sexo;	
	}
	public void setSexo(String sexo){  
		this.sexo = sexo;
	}
	
	public String getCidade(){
		return cidade;
	}
	public void setCidade(String cidade){
		this.cidade = cidade;
	}

	public String getEstado(){
		return estado;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
	
	public int getIdade(){
		return idade;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
}
