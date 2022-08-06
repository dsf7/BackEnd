package Mesa6;

public class Main {
    public static void main(String args[]){

        ListaDeSeriesProxy acesso = new ListaDeSeriesProxy(new ListaDeSeries());

        acesso.setDisponivel(new Contador(2));

        try {
            System.out.println("Assista já a série " + acesso.getSerie("CSI") + " com o link abaixo");
        }
        catch (SerieNaoHabilitadaException e){
            System.out.println(e);
        }


    }
}
