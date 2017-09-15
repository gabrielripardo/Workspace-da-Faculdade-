/**
 * Escreva a descrição da classe Teste aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Teste
{
   
    public static void main(String[] other){
        
        
        // Exemplo com conta
//        Conta c10 = new Conta();
//        c10.depositar(1000);
//        c10.sacar(500);
//        c10.sacar(600);
//        c10.consultarSaldo();
        
        // Exemplo com Conta Corretne
        
        Corrente cc20 = new Corrente();
        cc20.depositar(100);
        cc20.definirLimite(150);
        cc20.sacar(12);
        cc20.consultarSaldo();
    }    
}
