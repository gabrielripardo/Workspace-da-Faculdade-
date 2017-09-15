package exercicio3;
import java.util.Random;

public class NinjaAgua extends Ninja {

    public NinjaAgua(String nome) {
        super(nome);
    }

    public String atacar() {
        Random r = new Random();
        Integer aleatorio = r.nextInt(99) + 1;

        if (aleatorio <= 40) {
            return "AGUA";
        }
        else if (aleatorio <= 65) {
            return "FOGO";
        }
        else if (aleatorio <= 82) {
            return "VENTO";
        }
        else if (aleatorio <= 95) {
            return "RAIO";
        }
        else {
            return "TERRA";
        }
    }
}
