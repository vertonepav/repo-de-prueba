package parcialuno;

public class Circulo extends Elipse {
	
	public Circulo (double radio) {
		super(radio, radio);
	}

	@Override
	public String toString() {
		return "Circulo [area=" + area + "]";
	}
	
	
}
