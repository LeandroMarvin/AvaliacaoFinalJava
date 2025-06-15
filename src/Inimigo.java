public class Inimigo {

    private String nome;
    private int vida;
    private int ataque;
    private double chanceCritico;

    public Inimigo(String nome, int vida, int ataque, double chanceCritico) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.chanceCritico = chanceCritico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public double getChanceCritico() {
        return chanceCritico;
    }

    public void setChanceCritico(double chanceCritico) {
        this.chanceCritico = chanceCritico;
    }

    public void atacar(Heroi heroi) {
        int dano = ataque;
        boolean critico = Math.random() < chanceCritico;
        if (critico) {
            dano *= 2;
            System.out.println("Ataque crítico do inimigo!");
        }

        if (heroi.isEstaDefendendo()) {
            dano /= 2;
            System.out.println(heroi.getNome() + " está se defendendo! Dano reduzido para " + dano + ".");
            heroi.setEstaDefendendo(false); // Resetando defesa após o ataque
        }

        heroi.receberDano(dano);
        System.out.println(nome + " atacou " + heroi.getNome() + " causando " + dano + " de dano.\n\n");
    }

    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void exibirStatus() {
        System.out.println("Inimigo: " + nome + " | Vida: " + vida + "\n");
    }
}
