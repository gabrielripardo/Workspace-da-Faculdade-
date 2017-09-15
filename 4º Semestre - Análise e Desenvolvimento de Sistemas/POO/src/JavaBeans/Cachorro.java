package JavaBeans;
/**
 * As classes JavaBeans são usadas para representar modeos. Em banco de dados elas representam 
 * as entidades do banco de dados.
 * @author Gabriel Ripardo
 * @date 04/09/2017
 */
import java.util.Calendar;

public class Cachorro {
	private String nome;
	private String raca;
	private Calendar dtNascimento;
	private float peso;
	private float altura;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public Calendar getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
}
