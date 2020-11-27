import java.util.ArrayList;

/**
* Classe para descrever os atributos do site de origem.
* @author Jeferson Costa Silva
* @author Juliano Mendonça Lasmar
* @author Marcus Viniccius Souza de Freitas
**/

public class SitesOrigem {

  /** @site site **/
  public String site;

  /** @site canal **/
  public String canal;

  /** Pesquisa canais **/
  public ArrayList<String> pesquisarCanais(String nomeParcial) {
    return new ArrayList<>();
  }

  /** Pesquisa novelas **/
  public ArrayList<String> pesquisarNovelas(String nomeParcial) {
    return new ArrayList<>();
  }

  /** Pesquisa resumos **/
  public ArrayList<String> pesquisarResumos(String nomeParcial) {
    return new ArrayList<>();
  }

  /** inserir resumos **/
  public boolean inserirResumos(ArrayList<String> resumos) {
    return true;
  }

}