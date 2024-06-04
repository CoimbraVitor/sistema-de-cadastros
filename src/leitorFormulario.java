import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leitorFormulario {

    public static List<String> lerArquivo(String arquivo){
        Scanner leitorTxt;
        List<String> linhas = new ArrayList<>();
        {
            try {
                leitorTxt = new Scanner(new File(arquivo));
                while (leitorTxt.hasNextLine()){
                    linhas.add(leitorTxt.nextLine());
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return linhas;
    }

}
