package Mesa19;

import Aula19AoVivo.Cachorro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Contato> contatos = new ArrayList<>();

        Contato contato1 = new Contato("Daniel Fontoura", "daniel@gmail.com", "11 99999 1111");
        Contato contato2 = new Contato("Alexandre de Oliveira", "alexandre@gmail.com", "11 99999 2222");
        Contato contato3 = new Contato("Ewerton Lopes Pereira", "ewerton@gmail.com", "11 99999 3333");
        Contato contato4 = new Contato("Lucas Ferreira Nogueira", "lucas@gmail.com", "11 99999 4444");
        Contato contato5 = new Contato("Antonio Henrique Vanucci", "antonio@gmail.com", "11 99999 5555");


        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);
        contatos.add(contato4);
        contatos.add(contato5);


        // salvamos toda a coleção de páginas em um arquivo

        FileOutputStream fo = null;

        try {
            fo = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);

            objectOutputStream.writeObject(contatos);

        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
            //System.out.println("ERROR: " + e.getMessage()); - outra opção para mostrar mensagem para o usuário
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // recuperamos toda a coleção com cada uma das páginas do arquivo

        List<Contato> contatos2 = null;
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);

            contatos2 = (ArrayList) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Contatos Registrados:");

        for (Contato contato:contatos2){
            System.out.println(contato.getNome() + "\n("+contato.geteMail() +" | " + contato.getTelefone() + ")\n");
        }

    }
}
