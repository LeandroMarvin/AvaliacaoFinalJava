public class Elfo extends Heroi {

    public Elfo(String nome) {
        super(nome, 90, 12, 100, "Energia");
    }

    @Override
    public void usarHabilidadeEspecial(Inimigo inimigo) {
        int custoEnergia = 25;
        int dano = 35;

        if (getRecurso() >= custoEnergia) {
            setRecurso(getRecurso() - custoEnergia);
            inimigo.receberDano(dano);
            System.out.println(getNome() + " usou Flecha Fantasma causando " + dano + " de dano! Energia restante: " + getRecurso());
        } else {
            System.out.println(getNome() + " não tem energia suficiente para usar Flecha Fantasma!");
        }
    }

    @Override
    public void defender() {
        setEstaDefendendo(true);
        System.out.println(getNome() + " está se defendendo! Dano do próximo ataque será reduzido pela metade.");
    }
}
