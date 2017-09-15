package aula2;

public class PrimosSimple {
	public static void resolver(int max){
		int p = 2;
		while(p <= max){
			int divisores = 0;
			for(int i = 1; i <= max; i++){ // checagem de número primo
				if (p % i == 0){	
					divisores += 1;
				}
			}
			if(divisores == 2){
				System.out.println("Primo: " + p);
			}
		p++;
		}
	}
	
	public static void main(String[] args){
		resolver(30);
	}
}
