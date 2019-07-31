package Interfaces;

public class Circulo implements AreaCalculavel {
    private double raio;
    public static final double pi = 3.14;
    public Circulo(double raio){
        this.raio = raio;
    }
public String toString(){
	return "O Circulo tem area de "+pi*raio*raio+".";
}
@Override
public double calcularArea() {
	return pi*raio*raio;
}
}