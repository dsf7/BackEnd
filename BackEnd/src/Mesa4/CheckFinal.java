package Mesa4;

public class CheckFinal {

    QualityCheck inicial;

    public CheckFinal(){
        this.inicial = new LoteCheck();
        QualityCheck peso = new PesoCheck();
        QualityCheck embalagem = new EmbalagemCheck();

        inicial.setSeguinte(peso);
        peso.setSeguinte(embalagem);
    }

    public void conferir(Artigos artigo){
        inicial.conferir(artigo);
    }
}
