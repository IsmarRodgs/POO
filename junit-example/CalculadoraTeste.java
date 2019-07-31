import static  org.junit.Assert.assertEquals ;
import  org.junit.Test ;
public class CalculadoraTeste {
    public int maior(int a, int b){
        if (a>b) return a;
        else return b;
    }
    public int soma(int a, int b, int c){
        return a+b+c;
    }
    public int subtrai(int a, int  b){
        return a-b;
    }
    public double raiz(double a){
        return Math.sqrt(a);
    } 
    public double media(double a, double b, double c){
        return (a+b+c)/3;
    }
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
        assertEquals(4,raiz(16),0.1);
        assertEquals(2.8,raiz(8),0.1);
    }
}//
//Compile o teste. No Linux ou MacOS
//
//javac -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar CalculatorTest.java
//e no Windows
//
//javac -cp .;junit-4.XX.jar;hamcrest-core-1.3.jar CalculatorTest.java

//Execute o teste na linha de comando. No Linux ou MacOS
//

//java -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest
//e no Windows
//
//java -cp .;junit-4.XX.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest
