# Imersão Java <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="40" height="40" /> - Alura

Ao longo de uma semana a missão é desenvolver um projeto em Java.

## Aula 1: Consumindo uma API de filmes com Java

Construir um aplicação para consumir a API do [IMDb](https://www.imdb.com/) e exibir os filmes mais populares, destacando seus pôsteres e visualizando sua classificação, sem utilização de biblioteca externa.

**Links úteis:**

- Documentação da classe [HttpRequest do pacote java.net.http](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html).
- Documentação da API do IMDb: [https://imdb-api.com/api](https://imdb-api.com/api)

Devido a instabilidade no site do IMDb, consumi via -   [https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json](https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json)

## Aula 2: Gerando figurinhas para whatsapp

Criar um gerador de figurinhas explorando outras bibliotecas nativas do Java, para que possamos enviar por Whatsapp os nossos filmes preferidos.

**Exemplos de resultado:**

![Resultado aula 2](https://github.com/brunoesm07/imersao-java-2023/blob/8d21cb8d685a47917c3d5df6e7f3703a2187063f/Consumindo-uma-API-com-Java/assets/aula%202%20-%20exemplo.png)

**Links úteis:**

- Documentação do [pacote javax.imageio](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/imageio/package-summary.html), que trata de leitura e escrita de imagens.
- Documentação da [classe BufferedImage](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/image/BufferedImage.html), que representa uma imagem no Java
- Documentação da classe [Graphics2D](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/Graphics2D.html), a “caneta” que permite escrever, desenhar e imprimir outras imagens em uma imagem original.
- Documentação da [abstração InputStream](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/InputStream.html), que representa um fluxo de leitura de dados de qualquer fonte, como arquivos, URLs, entre outros.

## Aula 3: Ligando as pontas, Refatoração e Orientação a Objetos

Chegou o momento de melhorar o código com as refatorações necessárias para torná-lo mais flexível e fácil de entender.

**Exemplo de refatoração do código da aula 2, executado na aula 3.**

![Refatoramento](https://)

---

### Instrutores

|<img src="https://github.com/brunoesm07/imersao-java-2023/blob/a9e877af39c60864d9dbaf894b2ce09c3ebd9ca2/Consumindo-uma-API-com-Java/assets/Paulo.png" width="160" height="160" /> | <img src="https://github.com/brunoesm07/imersao-java-2023/blob/a9e877af39c60864d9dbaf894b2ce09c3ebd9ca2/Consumindo-uma-API-com-Java/assets/jacqueline.png" width="160" height="160" /> | <img src="https://github.com/brunoesm07/imersao-java-2023/blob/a9e877af39c60864d9dbaf894b2ce09c3ebd9ca2/Consumindo-uma-API-com-Java/assets/alexandre.png" width="160" height="160" /> | 
| :-----: | :-----: | :-----: |
| Paulo Silveira | [Jacqueline Oliveira](https://github.com/jacqueline-oliveira)| [Alexandre Aquiles](https://github.com/alexandreaquiles) |

---

## Extra

Não faz parte do conteúdo da imersão, porém estou tentando implementar, através do HitHub Actions, uma ferramenta SAST para escanear a aplicação em busca de vulnerabilidades de segurança a cada push, como prática dos demais assuntos que venho estudando.

Ferramentas utilizadas: 

**GitHub Actions + SonarCloud**
