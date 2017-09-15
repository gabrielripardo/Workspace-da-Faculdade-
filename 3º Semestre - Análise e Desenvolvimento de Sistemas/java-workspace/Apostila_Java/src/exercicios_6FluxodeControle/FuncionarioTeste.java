/**
 * @nome: Dados_funcionario.jar
 * @Função: Construa uma classe que peça o Nome, Endereço, Sexo, Cidade, Estado, Idade dos funcionários. Além disto, 
 * dado o Salário Bruto do funcionário, calcule o seu Salário Líquido. Considere que os descontos podem ser o Vale 
 * Transporte (2%), Vale Alimentação (5%) e Plano de Saúde (10%). 
 * @author: Gabriel Ripardo 
 * @Data_de_criação: 12/04/2017
 * @Comments: Dificuldade em inserir vários nomes em uma mesma linha. Problema com com nextLine, next.. 
 */

package exercicios_6FluxodeControle;
import java.util.Scanner;

public class FuncionarioTeste {
	public static void main(String []args){
		
		Funcionario gabriel = new Funcionario();
		Scanner entrance = new Scanner(System.in);
		
		// Entrada de dados pelo terminal
		
		System.out.print("");
		
		System.out.print("Nome: ");
		String nom = entrance.nextLine();
		
		System.out.print("Sexo: ");
		String sex = entrance.next();
		
		System.out.print("Salário: ");
		float liq = entrance.nextFloat();
		
		System.out.print("Idade: ");
		int years = entrance.nextInt();
		
		System.out.print("Cidade: ");
		String pog = entrance.nextLine();
		String city = entrance.nextLine();
		
		System.out.print("Endereco: ");
		String endr = entrance.nextLine();
		
		System.out.print("Estado: ");
		String est = entrance.nextLine();
		
		
		
		// Inserindo valores da entrada nos parâmetros dos métodos
		gabriel.setLiquid(liq);
		gabriel.setNome(nom);
		gabriel.setSexo(sex);
		gabriel.setIdade(years);
		gabriel.setCidade(city);
		gabriel.setEndereco(endr);
		gabriel.setEstado(est);
		
		
		// Imprimindo todos os retornos de cada método
		System.out.println("\n\n>>>>> Suas informações <<<<");
		
		System.out.println("Nome: " + gabriel.getNome());
		System.out.println("Salário liquído: R$ " + gabriel.getLiquid());
		System.out.println("Sexo: " + gabriel.getSexo());
		System.out.println("Idade: " + gabriel.getIdade());
		System.out.println("Cidade: " + gabriel.getCidade());
		System.out.println("Endereço: " + gabriel.getEndereco());
		System.out.println("Estado: " + gabriel.getEstado());
	}
}
