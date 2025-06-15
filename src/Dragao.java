public class Dragao extends Inimigo {

    public Dragao(String nome, int vida, int ataqueBase, double chanceAcertoCritico) {
        super(nome, vida, ataqueBase, chanceAcertoCritico);
    }

    public Dragao() {
        super("Dragão", 200, 30, 0.25);
    }

    @Override
    public void atacar(Heroi heroi) {
        System.out.println("Dragão lança um ataque poderoso!");
        super.atacar(heroi);
    }
}
