class working_methods{
	public static void main(String [] args){
		message();
		int show_soma = soma(4, 16);
		System.out.printf("Ḿétodo soma chamado, a soma é igual a " + show_soma);
	}
	public static void message(){
		System.out.println("Let's learn about methods..");
	}
	public static int soma(int num1, int num2){
		int result = num1 + num2;
		return result;
	}
}