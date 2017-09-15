package exercicio3;
import java.util.Random;

public class NinjaTerra extends Ninja {

    public NinjaTerra(String nome) {
        super(nome);
    }

    public String atacar() {
        Random r = new Random();
        Integer aleatorio = r.nextInt(99) + 1;

        if (aleatorio <= 40) {
            return "TERRA";
        }
        else if (aleatorio <= 65) {
            return "AGUA";
        }
        else if (aleatorio <= 82) {
            return "FOGO";
        }
        else if (aleatorio <= 95) {
            return "VENTO";
        }
        else {
            return "RAIO";
        }
    }
}
