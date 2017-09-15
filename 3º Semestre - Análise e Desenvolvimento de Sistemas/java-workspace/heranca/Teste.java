
/**
 * Escreva a descrição da classe Teste aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Teste
{
    // Assinatura padrão do método main 
    public static void main(String args[])
    {
        // Criação do objeto da classe Animal 
        //Animal objAnimal = new Animal("Cachorro JavaDog");
        
//        System.out.println("Nome..." + objAnimal.getNome());
//        objAnimal.nascer();
//        objAnimal.morrer();
        
        // Criando um outro objeto
//        Animal objAnimal2 = new Animal("Gato JavaCat");     

         Cachorro javaDog = new Cachorro("JavaDOG", "Pequeno");
         
         // Executando os métodos do objeto 
         javaDog.nascer();
         javaDog.latir();
         javaDog.morder();
         javaDog.morrer();
         
         
         Gato javaCat = new Gato("JavaCat", "Branco");
        
         Gato jvmCat = new Gato();
         
         javaCat.nascer();
         
         
         
         
         
         
        
        
        
        
        
    }
    
}
