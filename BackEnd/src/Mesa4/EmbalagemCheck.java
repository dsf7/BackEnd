package Mesa4;

public class EmbalagemCheck extends QualityCheck{
    @Override
    public void conferir(Artigos artigo) {
        if((Artigos.getEmbalagem().equalsIgnoreCase("Apresentável")) ||
                (Artigos.getEmbalagem().equalsIgnoreCase("Quase apresentável"))){
            System.out.println("✓ Embalagem do produto " + Artigos.getNome() +
                    " aceita. Produto aprovado para venda.");
        }
        else {
            System.out.println("✖ Embalagem do produto " + Artigos.getNome() +
                    " rejeitada. Produto não aprovado.");
        }
    }
}
