import java.util.Scanner;

public class clsMain{
    private static Scanner num;

	public static void main(String[] args) {
    	System.out.println(">>>>>>> Ordenation of NUMBERS <<<<<<");
	
    	num = new Scanner(System.in);
		int estrelas[] = new int [5];
		
		for(int i = 0; i < estrelas.length; i++){
			System.out.print("Number: ");
			estrelas[i] = num.nextInt(); 
		}
	    
	    HeapSort ordenation = new HeapSort();
	    ordenation.sort(estrelas);
	    
	    // This for make the conection with Database
	    /*for(int i = 0; i < estrelas.length; i++){
	        clsClientes cliente = new clsClientes();
	        cliente.setid(estrelas[i]);
	        clsSQLClientes tabela = new clsSQLClientes();
	        tabela.Inserir();       
	    }*/   
	        
	     System.out.print("");   
		 System.out.printf(">>>>>>>>>>>>> HEAP SORTing <<<<<<<<<<<<<<\n");
		 for(int i = 0; i < estrelas.length; i++){
			 System.out.println(estrelas[i]);
		 }
	}
}