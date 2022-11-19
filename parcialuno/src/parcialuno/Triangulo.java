package parcialuno;

public class Triangulo extends Figura {

	public Triangulo(double base, double altura) {
		area = (base * altura) / 2;
	}

	@Override
	public double calcularArea() {
		return area;
	}

	@Override
	public int compareTo(Figura unTriangulo) {
		return Double.compare(getArea(), unTriangulo.getArea());
	}

	@Override
	public String toString() {
		return "Triangulo [area=" + area + "]";
	}

	
}
