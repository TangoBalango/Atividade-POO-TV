public class Main {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        ControleRemoto controle = new ControleRemoto(tv);

        tv.ligar();
        tv.aumentarVolume();
        tv.trocarCanal(5);
        System.out.println(tv.toString());

        controle.ligar();
        controle.aumentarVolume();
        controle.trocarCanal(10);
        System.out.println(tv.toString());
    }
}