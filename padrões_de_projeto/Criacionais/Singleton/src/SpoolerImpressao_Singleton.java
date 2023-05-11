import java.util.ArrayList;
import java.util.List;

public class SpoolerImpressao_Singleton {
    public static List<String> nomesArquivos = new ArrayList<>();

    public static void insereArquivos(String nomeArquivo){
        nomesArquivos.add(nomeArquivo);
    }

}
