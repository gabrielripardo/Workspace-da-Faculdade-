/**
 * @descricao Faça uma classe chamada TestaTurma para criar dois objetos da classe Turma. Adicione informações a eles 
 * e depois mostre essas informações na tela.
 * @author Gabriel Ripardo
 * @date 21/04/17
 */
package exercicios_8OrientacaoaObjetos;

public class TesteTurma {
	public static void main(String[]args){
		Turma t1 = new Turma();
		t1.periodo = "noite";
		t1.serie = 3;
		t1.sigla = "TADS";
		t1.tipoEnsino = "Presencial";
		
		Turma t2 = new Turma();
		t2.periodo = "manha";
		t2.serie = 6;
		t2.sigla = "CPda";
		t2.tipoEnsino = "Presencial";
		
		System.out.println(t1.periodo);
		System.out.println(t1.serie);
		System.out.println(t1.sigla);
		System.out.println(t1.tipoEnsino + "\n" );
		
		System.out.println(t2.periodo);
		System.out.println(t2.serie);
		System.out.println(t2.sigla);
		System.out.println(t2.tipoEnsino);
	}
}
