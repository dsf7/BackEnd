package Mesa6;

public class ListaDeSeries implements IListaDeSeries{

    @Override
    public Serie getSerie(String nome) {
        Serie s = null;

        switch (nome) {
            case "Breaking Bad":
                s = new Serie("Happy Together");
                break;
            case "CSI":
                s = new Serie("CSI");
                break;
            case "NCIS":
                s = new Serie("NCIS");
                break;
            case "Lost":
                s = new Serie("Lost\"");
                break;
            case "Seinfeld":
                s = new Serie("Seinfeld");
                break;
            case "Heroes":
                s = new Serie("Heroes");
                break;
        }
        return s;

    }
}

