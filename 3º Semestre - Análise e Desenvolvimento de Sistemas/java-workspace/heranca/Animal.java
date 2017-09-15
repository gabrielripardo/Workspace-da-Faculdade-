public class Animal
{
    // Atributo 
    private String nome;
    
    // Método Construtor    
   // public Animal(String nome){
//        this.nome = nome;
//        System.out.println("Criação do objeto....");
//    }
               
    // Métodos 
    public void nascer(){
        System.out.println("Animal nascendo..." + getNome());
    }
    
    public void morrer(){
        System.out.println("Animal morrendo.." + getNome());
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
}
