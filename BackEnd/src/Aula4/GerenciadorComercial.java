package Aula4;

import org.junit.jupiter.api.Test;

public class GerenciadorComercial extends Gerenciador{

    @Override
    public void verificar(Mail eMail) {
        if((eMail.getDestino().equalsIgnoreCase("comercial@colmeia.com")) ||
        (eMail.getAssunto().equalsIgnoreCase("Comercial"))){
            System.out.println("Enviando ao Departamento Comercial");
        }
        else {
            if(this.getSeguinte()!=null){
                this.getSeguinte().verificar(eMail);
            }
        }

    }
}
