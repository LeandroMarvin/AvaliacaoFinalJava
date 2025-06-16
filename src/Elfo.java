public class Elfo extends Heroi {

    public Elfo(String nome) {
        super(nome, 90, 15, 100, "Flechas");
    }

    @Override
    public void usarHabilidadeEspecial(Inimigo inimigo) {
        int custoFlechas = 25;
        int dano = 35;

        if (getRecurso() >= custoFlechas) {
            setRecurso(getRecurso() - custoFlechas);
            inimigo.receberDano(dano);
            System.out.println(getNome() + " usou Flecha Fantasma causando " + dano + " de dano! Flechas restantes: " + getRecurso());
        } else {
            System.out.println(getNome() + " não tem flechas suficientes para usar Flecha Fantasma!");
        }
    }

    @Override
    public void defender() {
        setEstaDefendendo(true);
        System.out.println(getNome() + " está se defendendo! Dano do próximo ataque será reduzido pela metade.");
    }
}
