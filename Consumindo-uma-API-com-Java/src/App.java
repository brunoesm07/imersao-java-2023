import java.net.URI;
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
       
        // exibir os dados
        for (Map<String,String> filme : listaDeFilmes) {
            System.out.println("\u001b[1m\u001b[44mTitulo:\u001b[m " + filme.get("title"));
            System.out.println("\u001b[1mURL da imagem: \u001b[m" + filme.get("image"));
            System.out.println("\u001b[1m\u001b[33mAvaliação:\u001b[m " + filme.get("imDbRating"));
            System.out.println();
        }
    }
}
