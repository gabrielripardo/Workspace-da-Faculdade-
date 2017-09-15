/**
 * @descricao Crie uma classe em Java chamada BatimentosCardiacos. Os atributos da classe devem incluir o nome, sobrenome 
 * e data de nascimento da pessoa (consistindo em atributos separados para mês, dia e ano de nascimento). Sua classe deve ter um construtor 
 * que recebe esses dados como parâmetros. Para cada atributo forneça os métodos set e get. A classe também deve incluir um método que calcula 
 * e retorna a idade da pessoa (em anos), um método que calcula e retorna a frequência cardíaca máxima e um método que calcula e retorna a 
 * frequência cardíaca-alvo da pessoa. 
 * 
 *@author Gabriel_Ripardo
 *@date 26/04/17
 */
package Batimentos;

public class BatimentosCardiacos {
	private String nome;
	private String sobrenome;
	private byte mes;
	private byte dia;
	private int ano;
	
	public BatimentosCardiacos(String nome, String sobrenome, byte mes, byte dia, int ano){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}
	public String getSobrenome(){
		return sobrenome;
	}
	public void setMes(byte mes){
		this.mes = mes;
	}
	public byte getMes(){
		return mes;
	}
	public void setDia(byte dia){
		this.dia = dia;
	}
	public byte getDia(){
		return dia;
	}
	public void setAno(int ano){
		this.ano = ano;
	}
	public int getAno(){
		return ano;
	}
	public int idade(){
		int anoAtual = 2017;
		int qtdAnos = anoAtual - ano;
		return qtdAnos;
	}
	public int freqCardiMax(){ //fórmula para calcular a frequência cardíaca máxima por minuto é 220 menos a idade. 
		int fcm = 220 - idade(); 
		return fcm;
	}
	public float freqCardiAlvo(){ //Sua frequência cárdica alvo é um intervalo entre 50-80% da frequência cardíaca máxima. 
		float fca = (float) 0.50 * freqCardiMax(); 
		return fca;
	}
}




























