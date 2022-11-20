package interfaces.ejuno;

public class Circulo implements Figura{
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public double area() {
		return radio * Math.PI * 2;
	}


	
	
}
