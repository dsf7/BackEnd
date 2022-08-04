package Mesa4;

public class LoteCheck extends QualityCheck{

    @Override
    public void conferir(Artigos artigo) {
        if ((Artigos.getLote() >= 1000) && (Artigos.getLote() <= 2000)) {
            System.out.println("• Lote do produto " + Artigos.getNome() + " aceito. Está dentro do esperado.");
            this.getSeguinte().conferir(artigo);
        }
        else {
            System.out.println("✖ Lote do produto " + Artigos.getNome() + " rejeitado. Produto não aprovado.");
        }
    }

}
