import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AvaliacaoAppTest {

    @org.junit.jupiter.api.Test
    void cadastrarAvalicao() {
        Personas p = new Personas();
        p.email = "emaillegal@email.com";
        float nota  = 5.23f;
        String comentario = "O filme era legal, mas o cara morre no final.";

        AvaliacaoApp a = new AvaliacaoApp();
        assertEquals(true, a.adicionarComentario(comentario), "Comentario legal");

    }

    @org.junit.jupiter.api.Test
    void listarAvaliacoes() {

        String comentario = "O filme era legal mas, o não cara morre no final.";
        String comentario2 = "O filme era legal, mas o cara morre no final.";
        String comentario3 = "O filme não era legal, mas o cara morre no final.";

        AvaliacaoApp a = new AvaliacaoApp();

        a.adicionarComentario(comentario);
        a.adicionarComentario(comentario2);
        a.adicionarComentario(comentario3);

        assertEquals(3, a.listarAvaliacoes().size());
    }
}