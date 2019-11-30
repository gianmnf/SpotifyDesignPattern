# SpotifyDesignPattern
Implementado para uma atividade da disciplina ANÁLISE E DESENVOLVIMENTO DE SISTEMAS onde é necessário juntar 3 design patterns em 1.

## Patterns usados
 - Simple Factory
 - Composite
 - Proxy
 
## O que cada pattern faz?
-   Simple Factory: Responsável por criar instâncias dos players free e premium gerados pelo proxy de uma forma mais simples e rápida, usando menos código.
- Composite: Usado para a criação de Singles,Albuns e Playlists, onde  é possível criar diversos singles de forma independente e se desejar pode-se gerar um album atráves destes singles.
-  Proxy: Responsável pelo gerenciamento dos players free e premium, onde coloco limitações ao meu player free, mas sem ser necessário a criação de um novo código apenas para ele, onde a programação do player premium é reutilizada no player free.

## Exemplo de Código
**Criando Singles**

Musica a = new Single("Chocolate Show - Cassia Eller",5.50f);

Musica s = new Single("Single Ladies - Beyonce",3.30f);

Musica x = new Single("The Time(Dirty Bit) - Black Eyed Peas",6.25f);

**Criando um album a partir dos Singles**

Musica xx = new Album(a,s,x);

**Gerando Players**

FactoryPlayer fp = new FactoryPlayer();

Player free = fp.criaPlayer("free");

Player premium = fp.criaPlayer("premium");

**Criando Playlists e adicionando músicas**

Playlist p = new Playlist();

Playlist alb = new Playlist();

alb.addMusica(xx);

p.addMusica(a);

**Tocando Singles e Albuns**

free.tocar(a);

premium.tocar(alb);
