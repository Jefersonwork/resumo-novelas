import java.util.ArrayList;

/**
* Classe para descrever os atributos da avaliação.
* @author Jeferson Costa Silva
* @author Juliano Mendonça Lasmar
* @author Marcus Viniccius Souza de Freitas
**/

public class AvaliacaoApp {
  
  // Definições de atributos
  /** @email Email da pessoa **/
  public String email;

  /** @nota Nota da pessoa **/
  private short nota;
  
  /** @comentario Comentario da avaliacao **/
  private String comentario;

  /** Casdastro avaliacao **/
  public boolean cadastrarAvalicao(String avaliacao) {
    return true;
  }
  
  /** lista avaliacao **/
  public ArrayList<String> ListarAvaliacoes() {

    // "select a.nome from avalicoes as a inner join persona as p on a.email = p.email where p.email = \"chuchubeleza@gmail.com\""

    return list;
  }
}