import static org.junit.Assert.*;

public class BogHandelTest {
    @org.junit.Test
    public void getBogPris(){
        double pris = 497;
        assertEquals(pris, bog.getPris(), 0.001);
    }
    @org.junit.Test
    public void getBogTitel(){
        String titel = "Java: how to program";
        assertEquals(titel, bog.getTitel(), 0.001);
    }
    @org.junit.Test
    public void getBogTitel(){
        String forfatter = "Deitel & Deitel";
        assertEquals(forfatter, bog.getAuthor(), 0.001);
    }
    @org.junit.Test
    public void getBogAntal(){
        int antal = 8;
        assertEquals(antal, bog.getAntal(), 0.001);
    }

}

