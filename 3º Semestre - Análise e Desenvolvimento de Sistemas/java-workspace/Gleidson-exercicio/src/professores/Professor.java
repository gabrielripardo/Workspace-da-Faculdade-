
package professores;

public class Professor {
	protected String nome;
	private long matricula;
	private byte dia;
	private byte mes;
	private int ano;
		
	public Professor(String nome, long matricula, byte dia, byte mes, int ano){
		this.ano = ano;
		this.matricula = matricula;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public void setMatricula(long matricula){
		this.matricula = matricula;
	}
	public long getMatricula(){
		return matricula;
	}
	public void setDataNasc(byte dia, byte mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public String getDataNasc(){
		String anoStr = Integer.toString(ano);
		String diaStr = Byte.toString(dia);
		String mesStr = Byte.toString(mes);
		String date = diaStr + "/" + mesStr + "/" + anoStr;
		return date;
	}
}
