/**
 * @descricao Faça uma classe chamada TestaAluno e crie dois objetos da classe Aluno atribuindo valores a eles. A classe 
 * também deve mostrar na tela as informações desses objetos.
 * @author Gabriel Ripardo
 * @date 21/04/17
 */
package exercicios_8OrientacaoaObjetos;

public class TestaAlunoOO {
	public static void main(String[] args){
		AlunoOO gabriel = new AlunoOO();
		gabriel.nome = "Gabriel Ripardo";
		gabriel.cpf = "05958636040";
		gabriel.rg = 3322379;
		
		System.out.println(gabriel.nome + "\n" + gabriel.cpf + "\n" + gabriel.rg);
		
		AlunoOO gabriela = new AlunoOO();
		gabriela.nome = "Gabriela silva";
		gabriela.cpf = "3234400011";
		gabriela.rg = 0022314;
		
		System.out.print(gabriela.nome + "\n" + gabriela.cpf + "\n" + gabriela.rg);
	}
}
