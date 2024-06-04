import java.io.FileWriter;
import java.io.IOException;

public class gravaResposta {
    String nome;
    String email;
    String idade;
    String altura;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public void gravarArquivo() {
        try (FileWriter writer = new FileWriter(nome.replaceAll("\\s+", "").toUpperCase() + ".txt")) {
            writer.write("Nome: " + nome + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Idade: " + idade + "\n");
            writer.write("Altura: " + altura + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
