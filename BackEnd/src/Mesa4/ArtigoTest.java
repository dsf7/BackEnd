package Mesa4;

public class ArtigoTest {

    public static void main(String args[]){
        CheckFinal processo = new CheckFinal();
        processo.conferir(new Artigos("Arroz", 1100, 1250, "Apresentável"));
        processo.conferir(new Artigos("Feijão", 2100, 1250, "Apresentável"));
        processo.conferir(new Artigos("Lentilha", 1500, 1350, "Quase Apresentável"));
        processo.conferir(new Artigos("Ervilha", 1500, 1280, "Amassada"));
    }

}
