import static org.junit.jupiter.api.Assertions.assertEquals;

class NotificacoesPersonasTest {
  
  @org.junit.jupiter.api.Test

  void notificarPersona() {
    String notificacao = "Saiu resumo da novela Os Mutantes.";

    NotificacoesPersonas n = new NotificacoesPersonas();
    assertEquals(true, n.notificarPersona(notificacao));
  }

}