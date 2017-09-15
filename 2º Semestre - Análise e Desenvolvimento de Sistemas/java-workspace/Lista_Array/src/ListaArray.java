/**
 * Implementação de uma Lista com Array (ArrayList) em Java
 * @author George Mendonça
 * Data: 06/09/2016
 * Atualização: 24/09/2016
 **/
import java.util.Arrays;

/**
 * Classe ListaArray - Gera as listas para utilização com estrutura de arrays
 */
public class ListaArray {
	private Object[] data; 			// Lista de objetos - Dados
	private int count = 0;			// Contador
	private int FIXED_SIZE = 10;	// Constante de tamanho 10

	/**
	 * Método construtor - Inicializa a Lista
	 */
	public ListaArray() {
		data = new Object[this.FIXED_SIZE];
	}

	/**
	 * Retorna o objeto especificado na Lista
	 * @param index
	 * @return data (Object)
	 */
	public Object get(int index) {
		if (index < count) {
			return data[index];
		} else { // Tratamento de Exceção para índice fora do limite
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	/**
	 * Adiciona um novo objeto na Lista
	 * @param obj (Object)
	 */
	public void add(Object obj) {
		if (data.length - count <= data.length / 2) {
			this.resize();
		}

		data[count++] = obj;
	}

	/**
	 * Remove o objeto da Lista
	 * @param index
	 * @return obj (Object)
	 */
	public Object remove(int index) {
		if (index < count) {
			Object obj = data[index];
			int temp = index;
			data[index] = null;

			// Os objetos dos índices maiores que index são deslocados um índice para a esquerda
			while (temp < count) {
				data[temp] = data[temp + 1];
				data[temp + 1] = null;
				temp++;
			}

			count--; // O último índice é decrementado
			return obj;
		} else { // Tratamento de Exceção para índice fora do limite
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	/**
	 * Redimenciona o tamanho da Lista
	 */
	public void resize() {
		data = Arrays.copyOf(data, data.length * 2);
	}

    /**
     * Retorna o tamanho da Lista 
     */
	public int size() {
		return count;
	}
}
