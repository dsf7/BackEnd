package Mesa1;

public class Circulo extends Figura {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = Math.PI*2*this.getRaio();
        return perimetro;
    }
    public double getRaio() {
        return raio;
    }
}
