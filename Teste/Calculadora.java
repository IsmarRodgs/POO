public class Calculadora {
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
}