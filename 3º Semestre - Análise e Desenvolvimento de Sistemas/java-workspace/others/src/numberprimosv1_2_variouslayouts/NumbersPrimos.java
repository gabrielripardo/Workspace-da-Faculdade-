/**
 * Descricao: Aprimoramento do programa com tratamento de erros com o Try Catch.
 * @date 17/05/17
 */
package numberprimosv1_2_variouslayouts;

public class NumbersPrimos {
	boolean value = false;

	int num;
	
	public NumbersPrimos(int num){
		this.num = num;
		
	}
	
	public boolean math(){ // Operação, que verifica se é primo e guarda como boolean
		int divisores = 4;
		// Números Primos 2, 5, 7, 11, 13, 17,
		for(int i = 1; i <= num; i++){
			if (num % i == 0){
				divisores = divisores - 1;
			}
		}
		if(divisores == 2)
			value = true;
		return value;
	}
	
	public String info(){ // Interpreta o valor booleano, se for true é verdadeiro, logo é primo.
			String msg;
			if (math() == true){
				msg = " é primo";
			}else
				msg = " não é primo";
		return msg;
	}
}
