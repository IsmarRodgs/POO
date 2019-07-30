
public class testCalculadora extends Calculadora{
    
    @Test
    public void maiorTest(){
        assertEquals(9,maior(9,5));
        assertEquals(9,maior(5,9));
        assertEquals(5,maior(5,5));
    }
    @Test
    public void somaTest(){
        assertEquals(9,soma(7, 2, 0));
        assertEquals(-5,soma(0,-10,5));
        assertEquals(0,soma(7,-9,2));
    }
    @Test
    public subtraiTest(){
        assertEquals(4,subtrai(9,5));
        assertEquals(-4,subtrai(5,9));
        assertEquals(0,subtrai(5,5));
    }
    public void raizTest(){
        assertEquals(4,raiz(16),0.1);
        assertEquals(2.8,raiz(8),0.1);
    }
}