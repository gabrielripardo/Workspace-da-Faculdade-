
/**
 * Escreva a descrição da classe Teste aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Teste
{
   
    public static void main(String[] args){
        
        
        // Exemplo com conta
//        Conta c10 = new Conta();
//        c10.depositar(1000);
//        c10.sacar(500);
//        c10.sacar(600);
//        c10.consultarSaldo();
        
        // Exemplo com Conta Corretne
        
 //       Corrente cc20 = new Corrente();
//        cc20.depositar(1000);
 //       cc20.definirLimite(1000);
  //      cc20.sacar(1500);
   //     cc20.consultarSaldo();
     
          //Conta conta10 = new Conta();
          Corrente cc30 = new Corrente();
          
          Cliente gleidson = new Cliente("954.922.122-22","Gleidson Porto", "23243423");
          cc30.setCliente(gleidson);
          
          cc30.definirLimite(10000);
          cc30.depositar(5000);
          cc30.sacar(1000);
          cc30.sacar(6000);
          cc30.imprimirExtrato();
          
          
          Poupanca cp100 = new Poupanca();
          cp100.depositar(50000);
          cp100.sacar(10000);
          cp100.depositar(40000);
          cp100.setJuros(1);
          cp100.aplicarRendimento();
          cp100.aplicarRendimento();
          cp100.imprimirExtrato();          
          
          
}
    
}
