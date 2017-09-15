package numbersprimos;
public class NumbersPrimos {
	boolean value = false;
	int num;
	String msg = "somadestrings";
	
	public NumbersPrimos(int num){
		this.num = num;
	}
	
	public boolean math(){
		int divisores = 4;
		// Números Primos 2, 5, 7, 11, 13, 17,
		for(int i = 1; i <= num; i++){
			if (num % i == 0){
				divisores = divisores - 1;
			}
		}
		if(divisores == 2)
			value = true;
		return value;
		
	}
	public String info(){
		if (math() == true){
			msg = " é primo";
		}else
			msg = " não é primo";
		return msg;
	}
}
