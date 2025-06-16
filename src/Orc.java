public class Orc extends Inimigo {

    public Orc() {
        super("Orc", 100, 20, 0.15);
    }

    public Orc(String nome, int vida, int ataque, double chanceCritico) {
        super(nome, vida, ataque, chanceCritico);
    }

    @Override
    public void habilidadeEspecial(Heroi heroi) {
        int danoGrito = 30;
        heroi.receberDano(danoGrito);
        System.out.println(getNome() + " usou Grito de Guerra causando " + danoGrito + " de dano!");
    }
}
