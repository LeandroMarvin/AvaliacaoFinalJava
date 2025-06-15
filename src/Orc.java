public class Orc extends Inimigo {

    public Orc(String nome, int vida, int ataqueBase, double chanceAcertoCritico) {
        super(nome, vida, ataqueBase, chanceAcertoCritico);
    }

    public Orc() {
        super("Orc", 120, 15, 0.25);
    }

    @Override
    public void atacar(Heroi heroi) {
        System.out.println("Orc avança para atacar!");
        super.atacar(heroi);  // Chama o método atacar da superclasse Inimigo
    }
}
