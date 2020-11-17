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
  private float nota;
  
  /** @comentario Comentario da avaliacao **/
  private ArrayList<String> comentarios;

  public AvaliacaoApp() {
    comentarios = new ArrayList<String>();
  }


  /** Casdastro avaliacao **/
  public boolean adicionarComentario(String avaliacao) {
    this.comentarios.add(avaliacao);
    return true;
  }
  
  /** lista avaliacao **/
  public ArrayList<String> listarAvaliacoes() {
    return this.comentarios;
  }
}