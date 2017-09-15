package exercicio3;
public class RankingNinja {
    static public void ranking(Ninja[] lista) {
        Ninja[] ninjas = lista.clone();
    	int maior;
        Ninja aux;

        for (int i=0; i < ninjas.length; i++) {
            maior = i;

            for (int j=i+1; j < ninjas.length; j++) {
                if (ninjas[j].getPontos() > ninjas[maior].getPontos()) {
                    maior = j;
                }
            }
            aux = ninjas[i];
            ninjas[i] = ninjas[maior];
            ninjas[maior] = aux;
        }
        
        System.out.println("*** RANKING DOS NINJAS ***");
        for (int item = 0; item < lista.length; item++) {
            System.out.println(ninjas[item].getNome() + " => " + ninjas[item].getPontos()+ " pontos!");
        }
        for(Ninja njIndex:ninjas) {
        	System.out.println(njIndex.getPontos());
        }
    }
}