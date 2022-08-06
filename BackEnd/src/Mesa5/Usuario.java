package Mesa5;

public class Usuario {

    private static String idUsuario;
    private static String tipoUsuario;

    public Usuario(String idUsuario, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.tipoUsuario = tipoUsuario;
    }

    public static String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public static String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario='" + idUsuario + '\'' +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                '}';
    }

    public static String assinante(){
        String mensagem = "";
        if (getTipoUsuario() == "Premium") {
            mensagem = "Premium";
        }
        if (getTipoUsuario() == "Free") {
            mensagem = "Free";
        }
        return mensagem;
    }

}
