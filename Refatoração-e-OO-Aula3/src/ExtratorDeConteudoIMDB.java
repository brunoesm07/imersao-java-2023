import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoIMDB implements ExtratorDeConteudo {
    
    public List<Conteudo> extraiConteudos(String json) {

        // extrair somente os dados de interesse (titulo, poster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> listaDeAtributos = parser.parse(json);

        return listaDeAtributos.stream()
            .map(atributos -> new Conteudo(atributos.get("title"), atributos.get("image").replaceAll("(@+) (.*).jpg$", "$1.jpg")))
            .toList();

    }
}   
