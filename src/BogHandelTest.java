import static org.junit.Assert.*;

public class BogHandelTest {
    @org.junit.Test
    public void getBogPris(){
        BogHandel bogHandel = new BogHandel();

        double pris = 497;
        assertEquals(pris, bogHandel.JHTP.getBogPris(),0.001);
    }
    @org.junit.Test
    public void getBogTitel(){
        BogHandel bogHandel = new BogHandel();
        String titel = "Java: how to program";
        assertEquals(titel, bogHandel.JHTP.getBogTitle());
    }

    @org.junit.Test
    public void getBogForfattor(){
        BogHandel bogHandel = new BogHandel();
        String forfatter = "Deitel & Deitel";
        assertEquals(forfatter, bogHandel.JHTP.getBogForfatter());
    }
    /*
    @org.junit.Test
    public void getBogAntal(){
        int antal = 8;
        assertEquals(antal, bog.getAntal(), 0.001);
    }
    */

}


