# Imersão Java - Alura

Ao longo de uma semana a missão é desenvolver um projeto em Java.

## Aula 1: Consumindo uma API de filmes com Java

Construir um aplicação para consumir a API do [IMDb](https://www.imdb.com/) e exibir os filmes mais populares, destacando seus pôsteres e visualizando sua classificação, sem utilização de biblioteca externa.

**Links úteis:**

- Documentação da classe [HttpRequest do pacote java.net.http](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html).
- Documentação da API do IMDb: [https://imdb-api.com/api](https://imdb-api.com/api)

Devido a instabilidade no site do IMDb, consumi via -   [https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json](https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json)

## Aula 2: Gerando figurinhas para whatsapp

Criar um gerador de figurinhas explorando outras bibliotecas nativas do Java, para que possamos enviar por Whatsapp os nossos filmes preferidos.

**Links úteis:**

- Documentação do [pacote javax.imageio](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/imageio/package-summary.html), que trata de leitura e escrita de imagens.
- Documentação da [classe BufferedImage](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/image/BufferedImage.html), que representa uma imagem no Java
- Documentação da classe [Graphics2D](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/Graphics2D.html), a “caneta” que permite escrever, desenhar e imprimir outras imagens em uma imagem original.
- Documentação da [abstração InputStream](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/InputStream.html), que representa um fluxo de leitura de dados de qualquer fonte, como arquivos, URLs, entre outros.