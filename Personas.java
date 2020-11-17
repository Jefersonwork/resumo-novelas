import java.util.Date;

/**
* Classe para descrever os atributos da pessoa.
* @author Jeferson Costa Silva
* @author Juliano Mendonça Lasmar
* @author Marcus Viniccius Souza de Freitas
**/

public class Personas {

  // Definições de atributos
  /** @email Email da pessoa **/
  public String email;
  /** @nome Nome da pessoa **/
  public String nome;
  /** @senha Senha da pessoa **/
  private String senha;
  /** @dataNascimento Data de nascimento da pessoa **/
  private Date dataNascimento;

  /** @sexo sexo da pessoa **/
  private String sexo;

  /** Personas **/
  public static void Personas() {}

  /** cadastra pessoas **/
  public boolean cadastrarPersonas() {
    //TODO Implementar método
    return true;
  }

   /** Listar estatistica **/
  public String estatisticasPersonas() {
    //TODO Implementar método
    return "stats";
  }

  /** Calcular idade **/
  public int calculaIdade() {
    //TODO Implementar método
    return 10;
  }
}