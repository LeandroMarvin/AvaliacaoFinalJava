public class Dragao extends Inimigo {

    public Dragao() {
        super("Dragão", 200, 35, 0.25);
    }

    public Dragao(String nome, int vida, int ataque, double chanceCritico) {
        super(nome, vida, ataque, chanceCritico);
    }

    @Override
    public void habilidadeEspecial(Heroi heroi) {
        int danoFogo = 50;
        heroi.receberDano(danoFogo);
        System.out.println(getNome() + " lançou Sopro de Fogo causando " + danoFogo + " de dano!");
    }
}
