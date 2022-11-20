package interfaces.ejuno;

public class Triangulo implements Figura {
	private double base, altura;
	
	public Triangulo(double base, double altura) {
		this.altura = altura;
		this.base = base;
	}

	@Override
	public double area() {
		return (base * altura) / 2;
	}


}
