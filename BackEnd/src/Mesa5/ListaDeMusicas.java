package Mesa5;

public class ListaDeMusicas implements IListadeMusicas {

    @Override
    public Musica getMusica(String titulo){
        Musica m = null;

        switch (titulo) {
            case "Happy Together":
                m = new Musica("Happy Together", "The Turtles");
            break;
            case "Dreams":
                m = new Musica("Dreams", "Fleetwood Mac");
            break;
            case "Kids":
                m = new Musica("Kids", "MGMT");
            break;
            case "Kashmir":
                m = new Musica("Kashmir", "Led Zeppelin");
            break;
            case "Porcelain":
                m = new Musica("Porcelain", "Moby");
            break;
        }
        return m;
    }
}
