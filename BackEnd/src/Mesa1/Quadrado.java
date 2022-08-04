package Mesa1;

public class Quadrado extends Figura{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = this.getLado()*4;
        return perimetro;
    }

    public double getLado() {
        return lado;
    }
}
