/**
 * @descricao Faça uma classe chamada TestaFuncionario e crie dois objetos da classe Funcionario atribuindo valores a 
 * eles. Mostre na tela as informações desses objetos
 * @author Gabriel Ripardo de Sena
 * @date 21/04/17
 * @commens dificuldade em converter tipos de dados. No caso de float para string;
 */
package exercicios_8OrientacaoaObjetos;

public class TesteFuncionario {
	public static void main(String[] args){
		
		Funcionario f1 = new Funcionario();
		f1.cargo = "Professor";
		f1.salario = 7.000f;
		
		Funcionario f2= new Funcionario();
		f2.cargo = "Zelador";
		f2.salario = 3.000f;
		
		
		
		System.out.printf("Cargo: %s \nSalario: %s  \n", f1.cargo, f1.salario);
	    System.out.printf("Cargo: %s \nSalario: %f \n", f2.cargo, f2.salario);

		
	}
}
