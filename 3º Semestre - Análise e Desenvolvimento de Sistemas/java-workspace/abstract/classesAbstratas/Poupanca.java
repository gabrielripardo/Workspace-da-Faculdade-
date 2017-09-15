
/**
 * Escreva a descrição da classe Poupanca aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Poupanca extends Conta
{
   private double juros;
   
   
   public void setJuros(double juros){
       this.juros = juros;
   }
   
   public double getJuros(){
       return juros;
    }
   
   public void aplicarRendimento() {
       // variável para armazenar o rendimento
       double rendimento;
       // calculando o rendimento
       rendimento = getSaldo() * (juros/100);
       // Aplicando o rendimento 
       depositar(rendimento);
    }
    
   public void imprimirExtrato(){
        System.out.println("******** EXTRATO POUPANÇA ******");
        System.out.println("Saldo.......: R$ " + getSaldo());
        System.out.println("Juros.......: R$ " + getJuros());
   }
}
