
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
    
    // polimorfismo - sobrescrita [As instruções do método sacar é substituído por outras]
    public void sacar(double valor){
        
        if (valor<=(limite+getSaldo())){ // Se o valor for menor ou igual ao limite somado ao ao saldo
            // Atualizando o saldo
        	setSaldo(getSaldo() - valor); // saldo - valor_saque /\ Este método é da classe pai
        }
        else {
        	System.out.print("Saldo Infuficiente!! \n"); // Se o valor do saque estrapolar o valor do saldo somado com o do limite
        }
        
    }
    // 800 <= 150 + 100 =    
    // 1000 - 800 
    
    
}
