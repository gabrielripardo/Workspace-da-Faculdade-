package professores;

public class ProfessorEfetivo extends Professor{
	int jornadaDeTrabalho;
	double salario;
	
	public ProfessorEfetivo(String nome, long matricula, byte dia, byte mes, int ano, int jornadaDeTrabalho, double salario) {
		super(nome, matricula, dia, mes, ano);
		this.jornadaDeTrabalho = jornadaDeTrabalho;
		this.salario = salario;
	}
	String validacao;
	public String jornadaDeTrab(){
		if (jornadaDeTrabalho <= 20){
			validacao = "20 hrs"; 
		}else if(jornadaDeTrabalho > 20 && jornadaDeTrabalho <= 40){
			validacao = "40 hrs";
		}else
			validacao = "Dedicação Exclusiva";
		
		return validacao;
	}
}
