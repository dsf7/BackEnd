package Mesa6;

public class ListaDeSeriesProxy implements IListaDeSeries{

    private ListaDeSeries listaDeSeries;

    private Contador disponivel;

    public ListaDeSeriesProxy(ListaDeSeries listaDeSeries) {
        this.setSerie(listaDeSeries);
    }


    @Override
    public Serie getSerie(String nome) throws SerieNaoHabilitadaException {
        String s;
        s = ("www." + IListaDeSeries.getSerie(nome) + ".com");
        Integer views = Contador.getAcessos() + 1;

        if(views > 5){
            throw new SerieNaoHabilitadaException("Você já assistiu as 5 séries incluídas no seu plano essa semana. " +
                    "Volte em alguns dias para assistir " + nome);
        }
        if(views <= 5){
            System.out.println("Clique no link abaixo para assistir " + nome + ". Essa é a " + views + "ª série da semana. " +
                    "Você ainda pode assistir " + (5 - views) + " séries.");
        }
        return s;
    }

    public void setSerie(ListaDeSeries serie){
        this.listaDeSeries = serie;
    }

    public void setDisponivel(Contador disponivel) {
        this.disponivel = disponivel;
    }

    public Contador getDisponivel() {
        return disponivel;
    }

}
