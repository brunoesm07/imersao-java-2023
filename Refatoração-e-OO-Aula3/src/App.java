import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

       // aula 3 API api = API.NASA;

        // fazer conexão http e buscar os top filmes
        // aula 3 String url = api.getUrl();
        String url = "http://localhost:8080/linguagens";
        ExtratorDeConteudo extrator = new ExtratorDeConteudoLinguagem();

        var http = new ClienteHttp();
        String json = http.buscaDados(url);

        // exibir os dados
        List<Conteudo> conteudos = extrator.extraiConteudos(json);

        var geradora = new geradorDeStickers();

        for (int i = 0; i < 3; i++) {
            Conteudo conteudo = conteudos.get(i);          

            InputStream inputStream = new URL(conteudo.urlImagem()).openStream();
            String nomeArquivo = "saida/" + conteudo.titulo() + ".png";

            geradora.cria(inputStream, nomeArquivo);

            System.out.println(conteudo.titulo());           
            System.out.println();
        }
    }
}