package Exerc1;

public class Principal {
    public static void main(String[] args){
        
        Protocolo p = new Protocolo ("11:11:11:11", "AA:AA:At:AA", 90, 01, 02, 01);
        
      //  11:11:11:11|AA:AA:AA:AA|100|01|02|01|02|01|05|PORTA|02|04|DATA
        
        String text = "PORTA";
        Param param = new Param(1, text.length(), text);
        p.AddParam(param); 

        System.out.println(p.Serializar());

        
    }
}