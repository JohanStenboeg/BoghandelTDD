import org.junit.Test;

import static org.junit.Assert.*;

public class BogHandelTest {
    @org.junit.Test
    public void getBogPris() {
        BogHandel bogHandel = new BogHandel();

        double prisJHTP = 497;
        double prisBJ2 = 495;
        assertEquals(prisJHTP, bogHandel.JHTP.getBogPris(), 0.001);
        assertEquals(prisBJ2, bogHandel.BJ2.getBogPris(), 0.001);
    }

    @org.junit.Test
    public void getBogTitel() {
        BogHandel bogHandel = new BogHandel();
        String titelJHTP = "Java: how to program";
        String titelBJ2 = "Beginning Java 2";
        assertEquals(titelJHTP, bogHandel.JHTP.getBogTitle());
        assertEquals(titelBJ2, bogHandel.BJ2.getBogTitle());
    }

    @org.junit.Test
    public void getBogForfattor() {
        BogHandel bogHandel = new BogHandel();
        String forfatterJHTP = "Deitel & Deitel";
        String forfatterBJ2 = "Ivor Horton";
        assertEquals(forfatterBJ2, bogHandel.BJ2.getBogForfatter());
    }

    @org.junit.Test
    public void getBogAntal() {
        BogHandel bogHandel = new BogHandel();
        int antalJHTP = 8;
        int antalBJ2 = 3;
        assertEquals(antalBJ2, bogHandel.BJ2.getAntal());
    }

    @org.junit.Test
    public void tilføjAntalTilBog() {
        BogHandel bogHandel = new BogHandel();
        bogHandel.flereBøgerKommetHjem(3, "JHTP");
        bogHandel.flereBøgerKommetHjem(5, "BJ2");
        int antalJHTP = 11;
        int antalBJ2 = 8;
        assertEquals(antalJHTP, bogHandel.JHTP.getAntal());
        assertEquals(antalBJ2, bogHandel.BJ2.getAntal());
    }

    @org.junit.Test
    public void nedsætPris() {
        BogHandel bogHandel = new BogHandel();
        bogHandel.nedsætPrisPåBog(395, "BJ2");
        bogHandel.nedsætPrisPåBog(650, "JHTP");
        double nyPrisBJ2 = 395.00;
        double nyPrisJHTP = 650.00;
        assertEquals(nyPrisBJ2, bogHandel.BJ2.getBogPris(), 0.001);
        assertEquals(nyPrisJHTP, bogHandel.JHTP.getBogPris(), 0.001);
    }

}

