package Mesa5;

public class Main {
    public static void main(String args[]){

        servicoDownload download = new servicoDownload(new ListaDeMusicas());

        download.setAssinante(new Usuario("dsf", "Premium"));

        try {
            System.out.println("⇣ Download da música " + download.getMusica("Dreams") + " iniciando!");
        }
        catch (DownloadBloqueadoException e){
            System.out.println(e);
        }

        servicoDownload download2 = new servicoDownload(new ListaDeMusicas());

        download2.setAssinante(new Usuario("joao", "Free"));

        try {
            System.out.println("⇣ Download da música " + download2.getMusica("Kids") + " iniciando!");
        }
        catch (DownloadBloqueadoException e){
            System.out.println(e);
        }

        servicoDownload download3 = new servicoDownload(new ListaDeMusicas());

        download3.setAssinante(new Usuario("javanes", "Premium"));

        try {
            System.out.println("⇣ Download da música " + download3.getMusica("Kashmir") + " iniciando!");
        }
        catch (DownloadBloqueadoException e){
            System.out.println(e);
        }

        servicoDownload download4 = new servicoDownload(new ListaDeMusicas());

        download4.setAssinante(new Usuario("malandro", "Free"));

        try {
            System.out.println("⇣ Download da música " + download3.getMusica("Porcelain") + " iniciando!");
        }
        catch (DownloadBloqueadoException e){
            System.out.println(e);
        }

    }
}
