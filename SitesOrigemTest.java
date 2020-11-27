import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SitesOrigemTest {

  @org.junit.jupiter.api.Test
  void pesquisarCanais(String nomeParcial) {
    SitesOrigem site = new SitesOrigem();
    String name = "Globo";

    assertEquals(true, site.pesquisarCanais(name));
  }

  @org.junit.jupiter.api.Test
  void pesquisarNovelas(String nomeParcial) {
    SitesOrigem site = new SitesOrigem();
    String novela = "Malhação";

    assertEquals(true, site.pesquisarCanais(novela));
  }

  @org.junit.jupiter.api.Test
  void pesquisarResumos(String nomeParcial) {
    SitesOrigem site = new SitesOrigem();
    String resumo = "lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et";

    assertEquals(true, site.pesquisarResumos(resumo));
  }

  @org.junit.jupiter.api.Test
  void inserirResumos(ArrayList<String> resumos) {
    SitesOrigem site = new SitesOrigem();
    String resumo = "lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et";

    assertEquals(true, site.inserirResumos(site.pesquisarResumos(resumo)));
  }

}