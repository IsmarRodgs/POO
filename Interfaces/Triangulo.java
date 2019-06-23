
public class Triangulo implements Figura {
	private double altura;
	private double base;
	
	public Triangulo(double altura, double base){
		this.altura = altura;
		this.base = base;
	}
	public String toString(){
		return "O triângulo com altura "+this.altura+" e de base "+this.base+" tem área "+(this.base*this.altura)/2;
	}
	public double calcularArea(){
		return (this.base*this.altura)/2;
	}
}
