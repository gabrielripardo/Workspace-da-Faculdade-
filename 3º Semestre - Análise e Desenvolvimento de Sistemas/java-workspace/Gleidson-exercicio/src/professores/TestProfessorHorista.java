package professores;

public class TestProfessorHorista {
	public static void main(String[] args){
		ProfessorHorista contrato = new ProfessorHorista("Gabriel", 1231231 , (byte) 06, (byte) 04, 1997);
		
		contrato.setSalHr(40);
		contrato.setHrsTrab(300);
		System.out.println("Data de nascimento: " + contrato.getDataNasc());
		System.out.print("Salário: " + contrato.salarioMes());
	}
}
