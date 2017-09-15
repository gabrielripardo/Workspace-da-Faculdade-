package exercicio3;
import java.util.Random;

public class NinjaRaio extends Ninja {

    public NinjaRaio(String nome) {
        super(nome);
    }

    public String atacar() {
        Random r = new Random();
        Integer aleatorio = r.nextInt(99) + 1;

        if (aleatorio <= 40) {
            return "RAIO";
        }
        else if (aleatorio <= 65) {
            return "TERRA";
        }
        else if (aleatorio <= 82) {
            return "AGUA";
        }
        else if (aleatorio <= 95) {
            return "FOGO";
        }
        else {
            return "VENTO";
        }
    }
}
