package exercicio3;
import java.util.Random;

public class NinjaFogo extends Ninja {

    public NinjaFogo(String nome) {
        super(nome);
    }

    public String atacar() {
        Random r = new Random();
        Integer aleatorio = r.nextInt(99) + 1;

        if (aleatorio <= 40) {
            return "FOGO";
        }
        else if (aleatorio <= 65) {
            return "VENTO";
        }
        else if (aleatorio <= 82) {
            return "RAIO";
        }
        else if (aleatorio <= 95) {
            return "TERRA";
        }
        else {
            return "AGUA";
        }
    }
}
