package Aula2;

public class Efetivo extends Funcionario{

    private double salarioBase;
    private double descontos;
    private double bonus;

    public Efetivo(String nome, String sobrenome, String numeroConta, double salarioBase, double descontos, double bonus) {
        super(nome, sobrenome, numeroConta);
        this.salarioBase = salarioBase;
        this.descontos = descontos;
        this.bonus = bonus;
    }
    @Override
    public double calcularSaldo(){
        return salarioBase + bonus - descontos;
    }

    @Override
    public void imprimirRecibo(double quantia){
        System.out.println("\n Gerado um recibo -- Funcionário EFETIVO");
    }

    @Override
    public void depositar(double quantia){
        System.out.println("\n Foi depositada uma quantia de: " + quantia);
    }

}
