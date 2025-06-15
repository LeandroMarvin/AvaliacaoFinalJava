public class Guerreiro extends Heroi {

    public Guerreiro(String nome) {
        super(nome, 120, 15, 120, "Vida");
    }

    @Override
    public void usarHabilidadeEspecial(Inimigo inimigo) {
        int custoVida = 10;
        int dano = 30;

        if (getVida() > custoVida) {
            setVida(getVida() - custoVida);
            inimigo.receberDano(dano);
            System.out.println(getNome() + " usou Fúria Sangrenta e causou " + dano + " de dano, mas perdeu " + custoVida + " de vida.");
        } else {
            System.out.println(getNome() + " não tem vida suficiente para usar Fúria Sangrenta!");
        }
    }

    @Override
    public void defender() {
        setEstaDefendendo(true);
        System.out.println(getNome() + " está se defendendo! Dano recebido será reduzido pela metade.");
    }
}
