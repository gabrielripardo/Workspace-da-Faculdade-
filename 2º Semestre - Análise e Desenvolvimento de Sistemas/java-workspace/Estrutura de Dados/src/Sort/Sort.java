/**
 * Implementação de Estruturas de Ordenação
 * @author George Mendonça
 * Data: 25/09/2016
 * Atualização: 08/11/2016
 */
package Sort;

public class Sort {

	private int[] ar; // Array de elementos

	private int nElementos; // Número de elementos

	/**
	 * Construtor - Define o tamanho da matriz pelo usuário
	 * @param max
	 */
	public Sort(int max) {
		ar = new int[max]; // Cria o array de elementos
		nElementos = 0;
	}
	/*
	public int[] getAr() {
		return ar;	
	}
	
	public void setAr(int[] ar) {
		this.ar = ar;
	}

	**/
	  
	 /*
	 * Método para adicionar um elemento no final do array
	 * @param valor
	 */
	public void inserir(int valor) { // Adiciona o elemento no final do array
		ar[nElementos] = valor; 	// Insere o elemento
		nElementos++; 			// Incrementa o tamanho do array
	}

	
	 //Método para exibir o conteúdo da matriz
	 public void exibir() { // Exibe o conteúdo da matriz
		for (int j = 0; j < nElementos; j++) // para cada elemento,
			System.out.print(ar[j] + " "); // Exibe o elemento
		System.out.println("");
	}

	
	 /*Algoritmo da Troca de Valores
	 * @param elemento
	 * @param proximoElemento
	 */
	private void trocar(int elemento, int proximoElemento) { // Algoritmo da Troca de Elementos
		int temp = ar[elemento];
		ar[elemento] = ar[proximoElemento];
		ar[proximoElemento] = temp;
	}
	
	//Algoritmo de ordenação Bobble Sort
	 public void bubbleSort() {
		int externo, interno;

		for (externo = nElementos - 1; externo > 0; externo--) // Loop externo (esquerda para direita)
			for (interno = 0; interno < externo; interno++) // Loop interno (direita para esquerda)
				if (ar[interno] > ar[interno + 1]) // Esta fora da ordem?
					trocar(interno, interno + 1); // Troca de posições
	}
	
	/**
	 * Algoritmo de ordenação Selection Sort
	 */
	public void selectionSort()  { // ALGORITMO SELECTION SORT!!!
		int externo, interno, minimo;

		for(externo=0; externo<nElementos-1; externo++) {   		// Loop externo
			minimo = externo;                     					// Mínimo
			for(interno=externo+1; interno<nElementos; interno++) 	// Loop interno
				if(ar[interno] < ar[minimo] )	// se Mínimo é maior,
					minimo = interno;        	// temos um novo Mínimo (seleção)
			trocar(externo, minimo);      		// Troca de posições
		}  // Fim do for exeterno
	}

	/**
	 * Algoritmo de ordenação Insertion Sort
	 */
	public void insertionSort() { // ALGORITMOS INSERTION SORT - Examina à frente separadamente...
		int interno, externo;
		for(externo=1; externo<nElementos; externo++) { // "externo" é a linha divisória
			int temp = ar[externo];            		// remove o item marcado
			interno = externo;                      	// iniciar mudanças em "externo"
			while(interno>0 && ar[interno-1] >= temp) { // enquanto o elemento é maior,
				ar[interno] = ar[interno-1];            // deslocar item para a direita
				--interno;                       		// vá para uma posição à esquerda
			}
			ar[interno] = temp;                  		// inserir item mcarcado
		}  // Fim do for
	}

	/**
	 *Algoritmo de ordenação Merge Sort
	 * @param array
	 * @return array
	 */
	public long[] mergeSort(long[] array) {
		if(array.length > 1)     {  
	        int elementsInA1 = array.length/2;  // Dividir para conquistar
	        int elementsInA2 = array.length - elementsInA1;  
	        // Deninição dos outros 2 arrarys resultantes
	        long[] arr1 = new long[elementsInA1];  
	        long[] arr2 = new long[elementsInA2];
	          
	        // Populando os dois novos arrays com os elementos do array de entrada
	        for(int i = 0; i < elementsInA1; i++)  // Populando o array 1 
	            arr1[i] = array[i];  
	  
	        for(int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)  // Populando o array 2
	            arr2[i - elementsInA1] = array[i];  
	        
	        // Recursividade
	        arr1 = mergeSort(arr1);  
	        arr2 = mergeSort(arr2);  
	          
	        int i = 0, j = 0, k = 0;  
	        
	        // Organizando as solução geral
	        while(arr1.length != j && arr2.length != k) {  
	            if(arr1[j] <= arr2[k]) {  
	                array[i] = arr1[j];  
	                i++;  
	                j++;  
	            } else {  
	                array[i] = arr2[k];  
	                i++;  
	                k++;  
	            }  
	        }  
	  
	        while(arr1.length != j) {  
	            array[i] = arr1[j];  
	            i++;  
	            j++;  
	        }  
	        while(arr2.length != k) {  
	            array[i] = arr2[k];  
	            i++;  
	            k++;  
	        }  
	    }
		return array;
	}

	public void heapSort() {}
	public void quickSort() {}
}