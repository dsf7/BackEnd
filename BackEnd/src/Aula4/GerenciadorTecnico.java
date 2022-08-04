package Aula4;

public class GerenciadorTecnico extends Gerenciador{

    @Override
    public void verificar(Mail eMail) {
        if((eMail.getDestino().equalsIgnoreCase("tecnica@colmeia.com")) ||
                (eMail.getAssunto().equalsIgnoreCase("Técnico"))){
            System.out.println("Enviando ao Departamento Técnico");
        }
        else {
            if(this.getSeguinte()!=null){
                this.getSeguinte().verificar(eMail);
            }
        }

    }
}
