package exercicio3;
import java.util.Random;

public class NinjaVento extends Ninja {

    public NinjaVento(String nome) {
        super(nome);
    }

    public String atacar() {
        Random r = new Random();
        Integer aleatorio = r.nextInt(99) + 1;

        if (aleatorio <= 40) {
            return "VENTO";
        }
        else if (aleatorio <= 65) {
            return "RAIO";
        }
        else if (aleatorio <= 82) {
            return "TERRA";
        }
        else if (aleatorio <= 95) {
            return "AGUA";
        }
        else {
            return "FOGO";
        }
    }
}
