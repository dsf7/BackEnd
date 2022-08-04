package Aula4;

public class GerenciadorSpam extends Gerenciador{

    @Override
    public void verificar(Mail eMail) {
        System.out.println("E-mail identificado como SPAM");
    }
}
