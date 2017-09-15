package exercicio3;
public class Luta {
    private Ninja ninja1;
    private Ninja ninja2;
    private int vitoriasNinja1;
    private int vitoriasNinja2;

    public Luta(Ninja ninja1, Ninja ninja2) {
        this.ninja1 = ninja1;
        this.ninja2 = ninja2;
        this.vitoriasNinja1 = 0;
        this.vitoriasNinja2 = 0;
    }

    public void iniciarLuta() {
        String ataque1, ataque2;
        int vencedorRound;

        System.out.println("================== Iniciando Luta ==================");
        System.out.println("*** " + this.ninja1.getNome() + " vs " + this.ninja2.getNome() + " ***");

        for (int i=0; i < 3; i++) {
            System.out.println("---------------- Round " + (i + 1) + " ----------------");
            ataque1 = this.ninja1.atacar();
            ataque2 = this.ninja2.atacar();

            System.out.println(this.ninja1.getNome() + " atacou com: " + ataque1);
            System.out.println(this.ninja2.getNome() + " atacou com: " + ataque2);

            vencedorRound = this.verificarAtaques(ataque1, ataque2);
            if (vencedorRound == -1) {
                System.out.println("Vencedor: " + this.ninja1.getNome());
                this.vitoriasNinja1 += 1;
            }
            else if (vencedorRound == 1) {
                System.out.println("Vencedor: " + this.ninja2.getNome());
                this.vitoriasNinja2 += 1;
            }
            else {
                System.out.println("Round Empatado");
            }
            System.out.println("-----------------------------------------");
        }

        if (this.vitoriasNinja1 == this.vitoriasNinja2) {
            this.ninja1.addPontosEmpate();
            this.ninja2.addPontosEmpate();
            System.out.println("Luta Empatada!");
        }
        else if (this.vitoriasNinja1 > this.vitoriasNinja2) {
            this.ninja1.addPontosVitoria();
            System.out.println(this.ninja1.getNome() + " vence a luta!");
        }
        else {
            this.ninja2.addPontosVitoria();
            System.out.println(this.ninja2.getNome() + " vence a luta!");
        }
        System.out.println("=======================================");
    }

    private int verificarAtaques(String ataque1, String ataque2) {

        if (ataque1 != ataque2) {
            if (ataque1 == "TERRA") {
                if (ataque2 == "AGUA" || ataque2 == "FOGO") {
                    return -1;
                }
                else {
                    return 1;
                }
            }
            else if (ataque1 == "AGUA") {
                if (ataque2 == "FOGO" || ataque2 == "VENTO") {
                    return -1;
                }
                else {
                    return 1;
                }
            }
            else if (ataque1 == "FOGO") {
                if (ataque2 == "VENTO" || ataque2 == "RAIO") {
                    return -1;
                }
                else {
                    return 1;
                }
            }
            else if (ataque1 == "VENTO") {
                if (ataque2 == "RAIO" || ataque2 == "TERRA") {
                    return -1;
                }
                else {
                    return 1;
                }
            }
            else if (ataque1 == "RAIO") {
                if (ataque2 == "TERRA" || ataque2 == "AGUA") {
                    return -1;
                }
                else {
                    return 1;
                }
            }
        }

        return 0;
    }
}
