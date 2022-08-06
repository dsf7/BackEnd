package Mesa5;

public class DownloadBloqueadoException extends Exception{

    public DownloadBloqueadoException(String alerta){
        super(alerta);
    }
}
