package exercicio3;
public class GuerraNinja {
    static public void main(String[] args) {
        NinjaTerra ninjaTerra = new NinjaTerra("Tsuchikage - Onoki");
        NinjaAgua ninjaAgua = new NinjaAgua("Mizukage - Mei Terumi");
        NinjaFogo ninjaFogo = new NinjaFogo("Hokage - Tsunade Senju");
        NinjaVento ninjaVento = new NinjaVento("Kazekage - Gaara");
        NinjaRaio ninjaRaio = new NinjaRaio("Raikage - A");

        Luta luta1 = new Luta(ninjaTerra, ninjaAgua);
        Luta luta2 = new Luta(ninjaTerra, ninjaFogo);
        Luta luta3 = new Luta(ninjaTerra, ninjaVento);
        Luta luta4 = new Luta(ninjaTerra, ninjaRaio);
        Luta luta5 = new Luta(ninjaAgua, ninjaFogo);
        Luta luta6 = new Luta(ninjaAgua, ninjaVento);
        Luta luta7 = new Luta(ninjaAgua, ninjaRaio);
        Luta luta8 = new Luta(ninjaFogo, ninjaVento);
        Luta luta9 = new Luta(ninjaFogo, ninjaRaio);
        Luta luta10 = new Luta(ninjaVento, ninjaRaio);

        System.out.println("#########################################");
        System.out.println("#        INICIANDO A GUERRA NINJA       #");
        System.out.println("#########################################");

        luta1.iniciarLuta();
        luta2.iniciarLuta();
        luta3.iniciarLuta();
        luta4.iniciarLuta();
        luta5.iniciarLuta();
        luta6.iniciarLuta();
        luta7.iniciarLuta();
        luta8.iniciarLuta();
        luta9.iniciarLuta();
        luta10.iniciarLuta();

        Ninja ninjas[] = {ninjaTerra, ninjaAgua, ninjaFogo, ninjaVento, ninjaRaio};
        RankingNinja.ranking(ninjas);
    
    }
}
