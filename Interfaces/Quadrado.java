package Interfaces;

public class Quadrado implements AreaCalculavel {
	private double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}
	public String toString(){
		return "O quadrado de lado "+this.lado+" tem area "+this.lado*this.lado+".";
	}
	public double calcularArea(){
		return this.lado*this.lado;
	}

}
