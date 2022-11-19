package parcialuno;

public class Cuadrado extends Rectangulo {

	public Cuadrado(double lado) {
		super(lado, lado);
	}

	@Override
	public String toString() {
		return "Cuadrado [area=" + area + "]";
	}
	
	
}
