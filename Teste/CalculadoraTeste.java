
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class CalculadoraTeste extends Calculadora{
    
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
    public void subtraiTest(){
        assertEquals(4,subtrai(9,5));
        assertEquals(-4,subtrai(5,9));
        assertEquals(0,subtrai(5,5));
    }
    @Test
    public void raizTest(){
        assertEquals(4,Math.sqrt(16),0.1);
        assertEquals(2.8,Math.sqrt(8),0.1);
    }
}