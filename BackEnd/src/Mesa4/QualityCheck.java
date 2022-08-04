package Mesa4;

import Aula4.Gerenciador;
import Aula4.Mail;

public abstract class QualityCheck {

    protected QualityCheck checkSeguinte;

    public QualityCheck getSeguinte() {
        return this.checkSeguinte;
    }

    public void setSeguinte(QualityCheck q) {
        this.checkSeguinte = q;
    }

    public abstract void conferir(Artigos artigo);

}
