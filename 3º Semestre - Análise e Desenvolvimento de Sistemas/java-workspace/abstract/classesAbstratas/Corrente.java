
/**
 * Escreva a descrição da classe Corrente aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Corrente extends Conta
{
   private double limite;
   
   public void definirLimite(double limite)
   {
       this.limite = limite;
       
    }
    
    
    public void sacar(double valor){
        
        if (valor<=(limite+getSaldo())){
            // Atualizando o saldo
            setSaldo(getSaldo() - valor);
        }
        
    }
    
    
    public void imprimirExtrato(){
        System.out.println("******** EXTRATO CONTA CORRENTE ******");
        System.out.println("Cliente...: " + getCliente().getNome());
        System.out.println("Saldo.......: R$ " + getSaldo());
        System.out.println("Limite......: R$ " + getLimite());
        System.out.println("Saldo total.: R$ " + (getLimite() + getSaldo()) );
        
    }
     
    public double getLimite(){
        return limite;
    }
    
}
