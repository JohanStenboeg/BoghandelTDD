import static junit.framework.TestCase.fail;

public class BogHandel {
    //Opretter første bogobjekt JHTP aka Java, how to program.
    Bog JHTP = new Bog(8, "Java: how to program", "Deitel & Deitel", 497.00);
    Bog BJ2 = new Bog(3, "Beginning Java 2", "Ivor Horton", 495.00);

    public void flereBøgerKommetHjem(int antalBøgerKommetHjem, String bogNavn){
        if(bogNavn == "JHTP") {
            int nytAntalBøger = JHTP.getAntal() + antalBøgerKommetHjem;
            if (antalBøgerKommetHjem >= 0) {
                JHTP.setAntal(nytAntalBøger);
                System.out.println("Antal af bøger fra bog: " + bogNavn + " er blevet opdateret. Nyt antal er " + nytAntalBøger);
            } else {
                System.out.println("Antallet af bøger der er kommet hjem skal være større end 0");
            }
        }
        if(bogNavn == "BJ2"){
            int nytAntalBøger = BJ2.getAntal() + antalBøgerKommetHjem;
            if(antalBøgerKommetHjem >= 0) {
                BJ2.setAntal(nytAntalBøger);
                System.out.println("Antal af bøger fra bog: " + bogNavn + " er blevet opdateret. Nyt antal er " + nytAntalBøger);
            } else {
                System.out.println("Antallet af bøger der er kommet hjem skal være større end 0");
            }
        }

    }
    public void nedsætPrisPåBog(double nyPris, String bogNavn){
        if(bogNavn == "JHTP") {
            if(nyPris >= 0) {
                JHTP.setBogPris(nyPris);
                System.out.println("Pris på " + bogNavn + " ændret til " + nyPris + ",- ddk.");
            } else {
                System.out.println("Den nye pris må ikke være negativ");
            }
        } else if (bogNavn == "BJ2"){
            if(nyPris >= 0) {
                BJ2.setBogPris(nyPris);
                System.out.println("Pris på " + bogNavn + " ændret til " + nyPris + ",- ddk.");
            } else {
                System.out.println("Den nye pris må ikek være negativ");
            }
        }
    }
}
