package GeneratedRandom;
import java.util.Random;
public class Principal {
	public static int gerarNumber(){
		Random num = new Random();
		int gerado = num.nextInt((100)+1);
		return gerado;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nRandom = 0;
		
		while(nRandom != 100) {
			nRandom = gerarNumber();
			
			if(nRandom < 40){
				System.out.println("1 "+nRandom);
			}else if(nRandom < 70) {
				System.out.println("2 "+nRandom);
			}else {
				System.out.println("3 "+nRandom);
			}
			//System.out.print(num);
		}
	}
}
