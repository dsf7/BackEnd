package Mesa6;

public class Contador {

    private Integer acessos;

    public Contador(Integer acessos) {
        this.acessos = acessos;
    }

    public static Integer getAcessos() {
        return acessos;
    }

    public void setAcessos(Integer acessos) {
        this.acessos = acessos;
    }
}
