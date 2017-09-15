package professores;

public class ProfessorHorista extends Professor{
	private int horasTrabalhadas;
	private float salarioHora;

	public ProfessorHorista(String nome, long matricula, byte dia, byte mes, int ano) {
		super(nome, matricula, dia, mes, ano);
	}
	public void setHrsTrab(int hT){
		this.horasTrabalhadas = hT;
	}
	public int gethrsTrab(){
		return horasTrabalhadas;
	}
	public void setSalHr(float salHora){
		this.salarioHora = salHora;
	}
	public float getSalHr(){
		return salarioHora;
	}
	public float salarioMes(){
		float sal = gethrsTrab() * getSalHr() ;
		return sal;
	}
}
