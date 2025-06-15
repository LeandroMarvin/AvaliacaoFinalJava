import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Bem-vindo ao RPG por Turnos =====");
        System.out.print("Digite o nome do seu herói: ");
        String nomeHeroi = scanner.nextLine();

        Heroi heroi = null;

        while (heroi == null) {
            System.out.println("\nEscolha a classe do seu herói:");
            MostrarDescricao.mostrarDescricaoGuerreiro();
            MostrarDescricao.mostrarDescricaoMago();
            MostrarDescricao.mostrarDescricaoAnao();
            MostrarDescricao.mostrarDescricaoElfo();

            System.out.print("\nDigite o número da classe: ");
            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    if (confirmarEscolha(scanner)) {
                        heroi = new Guerreiro(nomeHeroi);
                    }
                    break;
                case "2":
                    if (confirmarEscolha(scanner)) {
                        heroi = new Mago(nomeHeroi);
                    }
                    break;
                case "3":
                    if (confirmarEscolha(scanner)) {
                        heroi = new Anao(nomeHeroi);
                    }
                    break;
                case "4":
                    if (confirmarEscolha(scanner)) {
                        heroi = new Elfo(nomeHeroi);
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("\nHerói criado com sucesso!");
        heroi.exibirStatus();

        Inimigo[] inimigos = {
            new Inimigo("Goblin", 50, 8, 0.1),
            new Orc("Orc", 80, 15, 0.2),
            new Dragao("Dragão", 150, 25, 0.3)
        };

        for (Inimigo inimigo : inimigos) {
            System.out.println("\nUma batalha começou contra " + inimigo.getNome() + "!");

            while (heroi.estaVivo() && inimigo.estaVivo()) {
                System.out.println("\nEscolha sua ação:");
                System.out.println("1 - Atacar");
                System.out.println("2 - Defender");
                System.out.println("3 - Usar habilidade especial");
                System.out.println("4 - Usar poção");
                System.out.print("Digite a ação: ");
                String acao = scanner.nextLine();

                System.out.println();

                switch (acao) {
                    case "1":
                        heroi.atacar(inimigo);
                        break;
                    case "2":
                        heroi.defender();
                        break;
                    case "3":
                        heroi.usarHabilidadeEspecial(inimigo);
                        break;
                    case "4":
                        heroi.usarPocao();
                        break;
                    default:
                        System.out.println("Ação inválida.");
                        continue;
                }

                if (inimigo.estaVivo()) {
                    inimigo.atacar(heroi);
                } else {
                    System.out.println("\nInimigo derrotado!");
                }

                System.out.println();
                heroi.exibirStatus();
                inimigo.exibirStatus();
            }

            if (!heroi.estaVivo()) {
                break;
            }
        }

        System.out.println();
        if (heroi.estaVivo()) {
            System.out.println("Parabéns, " + heroi.getNome() + "! Você venceu todas as batalhas!");
        } else {
            System.out.println("Você foi derrotado. GAME OVER !");
        }

        int pontuacaoFinal = heroi.getVida() + heroi.getRecurso() + (heroi.getNumeroPocoes() * 10);
        if (!heroi.estaVivo()) {
            pontuacaoFinal = Math.max(pontuacaoFinal - 30, 0); // penalidade por derrota
        }

        RankingManager.salvarRanking(heroi.getNome(), pontuacaoFinal, heroi.estaVivo());

        scanner.close();
    }

    private static boolean confirmarEscolha(Scanner scanner) {
        System.out.print("Confirmar essa classe? (S/N): ");
        String resposta = scanner.nextLine().trim().toUpperCase();
        return resposta.equals("S");
    }
}
