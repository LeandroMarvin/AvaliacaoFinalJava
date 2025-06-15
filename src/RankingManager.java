import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RankingManager {

    private static final String ARQUIVO_RANKING = "ranking.txt";

    public static void salvarRanking(String nome, int pontuacao, boolean venceu) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO_RANKING, true))) {
            String status = venceu ? "venceu" : "foi derrotado";
            String data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
            writer.write(nome + " " + status + " e fez " + pontuacao + " pontos. [" + data + "]");
            writer.newLine();
            System.out.println("Ranking salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o ranking: " + e.getMessage());
        }
    }

    public static List<String> carregarRanking() {
        List<String> ranking = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_RANKING))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                ranking.add(linha);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de ranking não encontrado. Será criado um novo ao salvar.");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de ranking: " + e.getMessage());
        }
        return ranking;
    }

    public static void exibirRanking() {
        List<String> ranking = carregarRanking();
        if (ranking.isEmpty()) {
            System.out.println("Ranking vazio.");
        } else {
            System.out.println("===== Ranking =====");
            for (String linha : ranking) {
                System.out.println(linha);
            }
        }
    }
}
