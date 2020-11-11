import java.util.*;

public class AvaliacaoApp {
  
  /** @email Email da avaliacao **/
  public String email;

  /** Nota da avaliacao **/
  private short nota;
  
  /** Comentario da avaliacao **/
  private String comentario;

  public boolean cadastrarAvalicao(String avaliacao, Persona p) {
    return true
  }
  
  public ArrayList<String> ListarAvaliacoes() {

    "select a.nome from avalicoes as a inner join persona as p on a.email = p.email where p.email = \"chuchubeleza@gmail.com\""

    return list;
  }
}