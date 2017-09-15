import java.util.Scanner;

public class Clsprincipal{
    public static void main(String[] args) {
    	
    
        Scanner num = new Scanner(System.in);
	
		
		System.out.println(">>>>>>> NUMBERS ORDENATION <<<<<<");
	
		int estrelas[] = new int [5];
		
		 for(int i = 0; i < estrelas.length; i++){
			 System.out.print("Número: ");
			 estrelas[i] = num.nextInt(); 
		}
	    
	    	HeapSort ordenation = new HeapSort();
	    	ordenation.sort(estrelas);
	    	
	    for(int i = 0; i < estrelas.length; i++){
	        clsClientes cliente = new clsClientes();
	        cliente.setid(estrelas[i]);
	        clsSQLClientes tabela = new clsSQLClientes();
	        tabela.Inserir();       
	    }    
	        
	     System.out.print("");   
		 System.out.printf(">>>>>>>>>>>>> HEAP SORT <<<<<<<<<<<<<<\n");
		 for(int i = 0; i < estrelas.length; i++){
			 System.out.println(estrelas[i]);
		 }
	}
}