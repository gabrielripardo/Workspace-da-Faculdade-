package Batimentos;

public class TestBatimentosCardiacos {
	public static void main(String[] args){
		BatimentosCardiacos obj = new BatimentosCardiacos("Gabriel", "Ripardo", (byte) 04, (byte) 06, 1997);
		
		System.out.println(obj.idade());
		System.out.println(obj.freqCardiMax());
		System.out.println(obj.freqCardiAlvo());
	}
}
