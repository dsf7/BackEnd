package Mesa4;

public class PesoCheck extends QualityCheck{

    @Override
    public void conferir(Artigos checkArtigo) {
        if((Artigos.getPeso()>= 1200) && (Artigos.getPeso()<= 1300)) {
            System.out.println("• Peso do produto " + Artigos.getNome() + " aceito. Está dentro do esperado.");
            this.getSeguinte().conferir(checkArtigo);
        }
        else {
            System.out.println("✖ Peso do produto " + Artigos.getNome() +
                    " rejeitado. Produto não aprovado.");
            }
        }

    }
