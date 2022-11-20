package interfaces.ejuno;

public class Cuadrado implements Figura {
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return lado * lado;
	}



}
