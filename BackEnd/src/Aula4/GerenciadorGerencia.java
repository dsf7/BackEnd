package Aula4;

public class GerenciadorGerencia extends Gerenciador{

    @Override
    public void verificar(Mail eMail) {
        if((eMail.getDestino().equalsIgnoreCase("gerencia@colmeia.com")) ||
                (eMail.getAssunto().equalsIgnoreCase("Gerencia"))){
            System.out.println("Enviando ao Departamento Gerencial");
        }
        else {
            if(this.getSeguinte()!=null){
                this.getSeguinte().verificar(eMail);
            }
        }

    }
}
