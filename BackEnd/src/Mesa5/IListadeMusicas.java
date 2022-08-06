package Mesa5;

public interface IListadeMusicas {

    public Musica getMusica(String titulo) throws DownloadBloqueadoException;
}
