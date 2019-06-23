import java.util.ArrayList;
import java.util.List;

public class CalculadoraDeAreas {
	public static void main (String[]args){
		List<Figura> figuras = new ArrayList<Figura>();
		
		Figura triangulo = new Triangulo(9.0, 2.0);
		figuras.add(triangulo);
		
		figuras.add(new Quadrado(9));
		
		for (Figura f: figuras){
			System.out.println(f.toString());
		}
	}
}
