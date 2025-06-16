public class Mago extends Heroi {

    public Mago(String nome) {
        super(nome, 80, 18, 120, "Mana");
    }

    @Override
    public void usarHabilidadeEspecial(Inimigo inimigo) {
        int custoMana = 40;
        int dano = 50;

        if (getRecurso() >= custoMana) {
            setRecurso(getRecurso() - custoMana);
            inimigo.receberDano(dano);
            System.out.println(getNome() + " lançou Bola de Fogo causando " + dano + " de dano! Mana restante: " + getRecurso());
        } else {
            System.out.println(getNome() + " não tem mana suficiente para lançar Bola de Fogo!");
        }
    }

    @Override
    public void defender() {
        setEstaDefendendo(true);
        System.out.println(getNome() + " está se defendendo! Dano do próximo ataque será reduzido pela metade.");
    }
}
