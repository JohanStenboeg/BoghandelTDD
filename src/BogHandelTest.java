import static org.junit.Assert.*;

public class BogHandelTest {
    @org.junit.Test
    public void getBogPris() {
        BogHandel bogHandel = new BogHandel();

        double prisJHTP = 497;
        assertEquals(prisJHTP, bogHandel.JHTP.getBogPris(), 0.001);
    }

    @org.junit.Test
    public void getBogTitel() {
        BogHandel bogHandel = new BogHandel();
        String titelJHTP = "Java: how to program";
        assertEquals(titelJHTP, bogHandel.JHTP.getBogTitle());
    }

    @org.junit.Test
    public void getBogForfattor() {
        BogHandel bogHandel = new BogHandel();
        String forfatterJHTP = "Deitel & Deitel";
        assertEquals(forfatterJHTP, bogHandel.JHTP.getBogForfatter());
    }

    @org.junit.Test
    public void getBogAntal() {
        BogHandel bogHandel = new BogHandel();
        int antalJHTP = 8;
        assertEquals(antalJHTP, bogHandel.JHTP.getAntal());
    }


}

