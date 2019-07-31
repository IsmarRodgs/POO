package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraDeAreas {
	public static void main (String[]args){
		List<AreaCalculavel> figuras = new ArrayList<AreaCalculavel>();
		
		AreaCalculavel triangulo = new Triangulo(9.0, 2.0);
		AreaCalculavel quadrado = new Quadrado(9.0);
		AreaCalculavel circulo = new Circulo(7.0);
		figuras.add(circulo);
		figuras.add(triangulo);
		figuras.add(quadrado);
		for (AreaCalculavel f: figuras){
			System.out.println(f.toString());
			System.out.println(f.calcularArea());
		}
	}
}
