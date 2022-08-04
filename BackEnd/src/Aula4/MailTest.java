package Aula4;

public class MailTest {

    public static void main(String args[]){
        CheckMail processo = new CheckMail();
        processo.verificar(new Mail("email@mail.com", "tecnica@colmeia.com", "Reclamação"));
        processo.verificar(new Mail("email@mail.com", "info@colmeia.com", "Comercial"));
        processo.verificar(new Mail("email@mail.com", "tecnica@colmeia.com", "Gerência"));
        processo.verificar(new Mail("email@mail.com", "gerencia@colmeia.com", "Parabéns"));
        processo.verificar(new Mail("email@mail.com", "gerenca@colmeia.com", "Parabéns"));
    }



}
