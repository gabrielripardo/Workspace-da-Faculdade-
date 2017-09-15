
/**
 * Escreva a descrição da classe Cachorro aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Cachorro extends Animal
{
    // Atributos
    private String tamanho;
    
    // Método construtor da classe Cachorro 
    public Cachorro(String nome, String tamanho){
    	setNome(nome);
    	this.tamanho = tamanho;
      
    }
      
    
    // Métodos
    public void latir(){
        
        System.out.println("Cachorro latindo..." + getNome());
    }
    
    public void morder(){
        System.out.println("Cachorro mordendo..." + getNome());
    }
    
    
}
