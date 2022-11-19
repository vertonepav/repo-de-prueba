package parcialuno;

public class Rectangulo extends Figura {

	public Rectangulo(double base, double altura) {
		area = base * altura;
	}

	@Override
	public double calcularArea() {
		return area;
	}

	@Override
	public int compareTo(Figura unRectangulo) {
		return Double.compare(getArea(), unRectangulo.getArea());
	}

	@Override
	public String toString() {
		return "Rectangulo [area=" + area + "]";
	}
	
	
}
