package Mesa6;
public interface IListaDeSeries {
    public Serie getSerie(String nome) throws SerieNaoHabilitadaException;
}