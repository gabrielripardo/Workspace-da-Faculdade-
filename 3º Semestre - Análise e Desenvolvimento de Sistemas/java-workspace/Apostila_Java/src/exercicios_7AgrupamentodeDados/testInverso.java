package exercicios_7AgrupamentodeDados;

public class testInverso {
	public static void main(String[] args){
		Inverso obj = new Inverso();
		
		obj.Numbers();
		String[] inverso = obj.impress();
		for (int i = 0; i < 5; i++){
			System.out.print(inverso[i] + " ");
		}
	}
}
