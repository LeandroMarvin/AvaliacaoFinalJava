public class Anao extends Heroi {

    public Anao(String nome) {
        super(nome, 120, 15, 100, "Raiva");
    }

    @Override
    public void usarHabilidadeEspecial(Inimigo inimigo) {
        int custoRaiva = 30;
        int dano = 45;

        if (getRecurso() >= custoRaiva) {
            setRecurso(getRecurso() - custoRaiva);
            inimigo.receberDano(dano);
            System.out.println(getNome() + " usou Martelada Brutal causando " + dano + " de dano! Raiva restante: " + getRecurso());
        } else {
            System.out.println(getNome() + " não tem raiva suficiente para usar Martelada Brutal!");
        }
    }

    @Override
    public void defender() {
        setEstaDefendendo(true);
        System.out.println(getNome() + " está se defendendo! Dano do próximo ataque será reduzido pela metade.");
    }
}
