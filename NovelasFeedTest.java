import static org.junit.jupiter.api.Assertions.assertEquals;

class NovelasFeedTest {
  
  @org.junit.jupiter.api.Test
  void pesquisarTitulos(String nomeParcial) {
    NovelasFeed novela = new NovelasFeed();
    String titulo = "Os Mutantes";

    assertEquals(true, novela.pesquisarTitulos(titulo));
  }
  
  @org.junit.jupiter.api.Test
  void pesquisarCapitulo(int numCapitulo) {
    NovelasFeed novela = new NovelasFeed();
    int capitulo = 22;

    assertEquals(true, novela.pesquisarCapitulo(capitulo));
  }
  
  @org.junit.jupiter.api.Test
  void listarResumo() {
    NovelasFeed novela = new NovelasFeed();
    String resumo = "lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et";

    assertEquals(true, novela.listarResumo(), resumo);
  }

  
}