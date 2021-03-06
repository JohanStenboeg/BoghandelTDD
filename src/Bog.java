public class Bog {

    int antal = 0;
    String bogTitle = "";
    String bogForfatter = "";
    double bogPris = 0.0;

    public Bog(int antal, String bogTitle, String bogForfatter, double bogPris) {
        this.antal = antal;
        this.bogTitle = bogTitle;
        this.bogForfatter = bogForfatter;
        this.bogPris = bogPris;
        System.out.println("Ny bog oprettet ved navn " + bogTitle);
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public double setBogPris(double bogPris) {
        this.bogPris = bogPris;
        return bogPris;
    }

    public int getAntal() {
        return antal;
    }

    public String getBogTitle() {
        return bogTitle;
    }

    public String getBogForfatter() {
        return bogForfatter;
    }

    public double getBogPris() {
        return bogPris;
    }



}


