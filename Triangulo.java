package Polimorfismo;

public class Triangulo extends FormasGeometricas{
	//Area Triangulo Retangulo
	public void area(double base, double altura) {
		System.out.println(base*altura/2);
	}
	//Perimetro Triangulo Retangulo
	public void perimetro(double l1, double l2, double l3) {
		System.out.println(l1+l2+l3);
	}
	//Perimetro Triangulo Equilatero
	public void perimetro(double l1) {
		System.out.println(3*l1);
	}

}