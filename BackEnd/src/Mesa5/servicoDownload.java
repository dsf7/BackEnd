package Mesa5;

import static Mesa5.Usuario.*;

public class servicoDownload implements IListadeMusicas{

    private ListaDeMusicas listaDeMusicas;

    private Usuario assinante;

    public servicoDownload(ListaDeMusicas listaDeMusicas) {
        this.setMusica(listaDeMusicas);
    }

    @Override
    public Musica getMusica(String titulo) throws DownloadBloqueadoException{
        Musica m = listaDeMusicas.getMusica(titulo);

        if(getTipoUsuario() == "Free"){
            throw new DownloadBloqueadoException("• Download da música " + titulo +
                    " não permitido para o usuário " + Usuario.getIdUsuario() + ". Seja premium para baixar!");
        }
        if(getTipoUsuario() == "Premium"){
            System.out.println("• Usuario " + Usuario.getIdUsuario() + " obrigado por ser um assinante premium.");
        }
        return m;
    }

    public void setMusica(ListaDeMusicas musica){
        this.listaDeMusicas = musica;
    }

    public void setAssinante(Usuario assinante) {
        this.assinante = assinante;
    }

    public Usuario getAssinante() {
        return assinante;
    }
}

