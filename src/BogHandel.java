import static junit.framework.TestCase.fail;

public class BogHandel {
    //Opretter første bogobjekt JHTP aka Java, how to program.
    Bog JHTP = new Bog(8, "Java: how to program", "Deitel & Deitel", 497.00);
    Bog BJ2 = new Bog(3, "Beginning Java 2", "Ivor Horton", 495.00);

    public void flereBøgerKommetHjem(int antalBøgerKommetHjem, String bogNavn){
        if(bogNavn == "JHTP") {
            int nytAntalBøger = JHTP.getAntal() + antalBøgerKommetHjem;
            JHTP.setAntal(nytAntalBøger);
        } else if (bogNavn == "BJ2"){
            int nytAntalBøger = BJ2.getAntal() + antalBøgerKommetHjem;
            BJ2.setAntal(nytAntalBøger);
        } else fail();

    }
    public void nedsætPrisPåBog(int nyPris){

    }




}
