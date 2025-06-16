public class Goblin extends Inimigo {
    public Goblin() {
        super("Goblin", 50, 8, 0.1);
    }

    @Override
    public void habilidadeEspecial(Heroi heroi) {
        int dano = 20;
        heroi.receberDano(dano);
        System.out.println(getNome() + " usou Ataque Rápido causando " + dano + " de dano!");
    }
}
