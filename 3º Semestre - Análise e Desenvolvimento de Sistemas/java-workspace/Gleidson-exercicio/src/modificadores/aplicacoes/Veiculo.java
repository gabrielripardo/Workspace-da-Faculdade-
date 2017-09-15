/**
 *  atributos e métodos sem modificadores definidos pelo programador
 *  @date 25/05/2017
 */

package modificadores.aplicacoes;

public class Veiculo {
	String proprietario; // Padrão dos atributos são protected
	String cor;
	String marca;
	
	String getCor() {
		return cor;
	}
	void setCor(String cor) { // Padrão do escopo para o método é público
		this.cor = cor;
	}
	String getMarca() {
		return marca;
	}
	void setMarca(String marca) {
		this.marca = marca;
	}
	String getProprietario() {
		return proprietario;
	}
	void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
}
