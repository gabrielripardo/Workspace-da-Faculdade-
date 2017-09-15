
/**
 * Escreva a descrição da classe Gato aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Gato extends Animal
{
    // Atributos 
    String corPelo;
      
    // Método Construtor 
    
    // Polimorfismo com o método construtor. Sobrecarga.
    public Gato(String nome, String corPelo){
          setNome(nome);
          this.corPelo = corPelo;
    }
    
   // Polimorfismo com o método construtor.  Sobrecarga.
    public Gato(){
        System.out.println("Criação do objeto");
    }
    
    
    // Métodos 
    public void miar(){        
        System.out.println("Gato miando..");
    }
    
    
    public void dormir(){
        System.out.println("Gato dormindo...");
    }
    
}
