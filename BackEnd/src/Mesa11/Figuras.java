package Mesa11;

public class Figuras {
    private int id;
    private String tipo;
    private String cor;

    public Figuras(int id, String tipo, String cor) {
        this.id = id;
        this.tipo = tipo;
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Figuras{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
