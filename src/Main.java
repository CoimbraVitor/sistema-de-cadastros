import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        gravaResposta respostas = new gravaResposta();
        List<String> linhas = leitorFormulario.lerArquivo("src\\formulario.txt");
        Scanner input = new Scanner(System.in);
        for (String linha : linhas) {
            System.out.println(linha);
            String resposta = input.nextLine();
            if (linha.toLowerCase().contains("nome")) {
                respostas.setNome(resposta);
            } else if (linha.toLowerCase().contains("email")) {
                respostas.setEmail(resposta);
            } else if (linha.toLowerCase().contains("idade")) {
                respostas.setIdade(resposta);
            } else if (linha.toLowerCase().contains("altura")) {
                respostas.setAltura(resposta);
            }
        }
        respostas.gravarArquivo();
        System.out.println("Arquivo gravado com sucesso");
    }
}