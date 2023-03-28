import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        
        // fazer conexão http e buscar os top filmes
        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);

        // extrair somente os dados de interesse (titulo, poster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);

        var diretorio = new File("figurinhas/");
        diretorio.mkdir();
       
        // exibir os dados
        var geradora = new geradorDeStickers();
        for (Map<String,String> filme : listaDeFilmes) {
            
            String urlImagem = filme.get("image");
            String titulo = filme.get("title");   
            double classificacao = Double.parseDouble(filme.get("imDbRating"));

            String textoFigurinha;
            InputStream imagemSobreposicao; 
            if (classificacao >= 9.0) {
                textoFigurinha = "DIGNO DE OSCAR";
                imagemSobreposicao = new FileInputStream(new File("sobreposicao/oscar.png"));
            } else {
                textoFigurinha = "BEM AVALIADO";
                imagemSobreposicao = new FileInputStream(new File("sobreposicao/Joinha.png"));
            }
            
            InputStream inputStream = new URL(urlImagem).openStream();
            String nomeArquivo = "figurinhas/" + titulo + ".png";

            geradora.cria(inputStream, nomeArquivo, textoFigurinha, imagemSobreposicao);

            System.out.println("\u001b[1m\u001b[44mTitulo:\u001b[m " + filme.get("title"));
            System.out.println("\u001b[1mURL da imagem: \u001b[m" + filme.get("image"));
            System.out.println("\u001b[1m\u001b[33mAvaliação:\u001b[m " + filme.get("imDbRating"));
            System.out.println();
        }
    }
}
