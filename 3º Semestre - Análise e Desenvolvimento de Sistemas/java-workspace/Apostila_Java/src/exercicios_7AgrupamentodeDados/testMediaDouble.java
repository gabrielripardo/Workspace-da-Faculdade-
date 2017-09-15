package exercicios_7AgrupamentodeDados;

public class testMediaDouble {
	public static void main(String[] args){
		MediaDouble nota = new MediaDouble();
		
		nota.inserir();
		nota.showList();
		double media = nota.mediaDouble();
		
		
		System.out.print("Média: " + media);
	}
}
