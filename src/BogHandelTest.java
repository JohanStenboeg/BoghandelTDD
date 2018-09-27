import static org.junit.Assert.*;

public class BogHandelTest {
    @org.junit.Test
    public void getBogPris(){
        double pris = 49.95;
        assertEquals(pris, bog.getPris(), 0.001);
    }

}