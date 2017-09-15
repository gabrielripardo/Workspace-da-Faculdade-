public class ContGab {
	public static void main(String []args){
		Conta myaccount = new Conta();
		
		myaccount.depos((float) 500.50);
		myaccount.sacar(50);
		myaccount.verSaldo();
	}
}
