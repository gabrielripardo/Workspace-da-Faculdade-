package Conta;

public class Cliente {
	private String cpf;
	private String nome;
	private String cidade;
	private String uf;
	
	public Cliente(String cpf, String nome, String cidade, String uf) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.cidade = cidade;
		this.uf = uf;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
}
