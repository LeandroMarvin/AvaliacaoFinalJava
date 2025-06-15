public abstract class Heroi implements IAcoesDeCombate {

    private String nome;
    private int vida;
    private int ataqueBase;
    private int recurso;
    private String recursoNome;
    private int numeroPocoes;
    private boolean estaDefendendo = false;

    public Heroi(String nome, int vida, int ataqueBase, int recurso, String recursoNome) {
        this.nome = nome;
        this.vida = vida;
        this.ataqueBase = ataqueBase;
        this.recurso = recurso;
        this.recursoNome = recursoNome;
        this.numeroPocoes = 3;
    }

    public String getNome() { return nome; }
    public int getVida() { return vida; }
    public int getAtaqueBase() { return ataqueBase; }
    public int getRecurso() { return recurso; }
    public String getRecursoNome() { return recursoNome; }
    public int getNumeroPocoes() { return numeroPocoes; }
    public boolean isEstaDefendendo() { return estaDefendendo; }

    public void setNome(String nome) { this.nome = nome; }
    public void setVida(int vida) { this.vida = vida; }
    public void setAtaqueBase(int ataqueBase) { this.ataqueBase = ataqueBase; }
    public void setRecurso(int recurso) { this.recurso = recurso; }
    public void setRecursoNome(String recursoNome) { this.recursoNome = recursoNome; }
    public void setNumeroPocoes(int numeroPocoes) { this.numeroPocoes = numeroPocoes; }
    public void setEstaDefendendo(boolean estaDefendendo) { this.estaDefendendo = estaDefendendo; }

    public void atacar(Inimigo inimigo) {
        int dano = ataqueBase;
        boolean critico = Math.random() < 0.2;
        if (critico) {
            dano *= 2;
            System.out.println("Ataque crítico!");
        }
        inimigo.receberDano(dano);
        System.out.println(nome + " atacou " + inimigo.getNome() + " causando " + dano + " de dano.\n\n");
    }

    public void usarPocao() {
        if (numeroPocoes > 0) {
            vida += 30;
            numeroPocoes--;
            System.out.println(nome + " usou uma poção e recuperou 30 de vida. Vida atual: " + vida);
        } else {
            System.out.println("O herói " + nome + " não tem mais poções!");
        }
    }

    public void exibirStatus() {
        System.out.println("Herói: " + nome + " | Vida: " + vida + " | " + recursoNome + ": " + recurso + " | Poções: " + numeroPocoes + "\n");
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void receberDano(int dano) {
        if (estaDefendendo) {
            dano /= 2;
            System.out.println(nome + " defendeu o ataque! Dano reduzido para " + dano + ".");
            estaDefendendo = false;
        }
        vida -= dano;
        if (vida < 0) vida = 0;
    }

    // Métodos abstratos
    public abstract void defender();
    public abstract void usarHabilidadeEspecial(Inimigo inimigo);
}
