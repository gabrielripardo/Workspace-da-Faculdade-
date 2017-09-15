
public abstract class Conta
{
    // Atributos
    private int numero;
    private double saldo;
    private Cliente objCliente;
     
    
    public void setCliente(Cliente objCliente){
        this.objCliente = objCliente;
    }   
    
    public Cliente getCliente(){
        return objCliente;
    } 
    
    // Método sacar     
    public void sacar(double valor){
        
        if (saldo>=valor){
           saldo = saldo - valor;
           System.out.println("Operação de saque realizada...: "+ valor);
        }
        else System.out.println("Saldo insuficiente");
        
    }
    
    // Método depositar 
    public void depositar(double valor)
    {
        saldo = saldo + valor;
        System.out.println("Cliente...: " + (objCliente.getNome()));
        System.out.println("Operação de depósito realizada...: " + valor);
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    
    public int getNumero(){
        return numero;
    }
    
    
    public double getSaldo(){
        return saldo;
    }
    
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void consultarSaldo(){
        System.out.println("Consultar saldo..." + saldo);
        
    }
    
    public abstract void imprimirExtrato();
    
    
}
