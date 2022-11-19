package parcialuno;

public class Elipse extends Figura {

	public Elipse(double radioMayor, double radioMenor) {
		area = Math.PI * radioMayor * radioMenor;
	}

	@Override
	public double calcularArea() {
		return area;
	}

	@Override
	public int compareTo(Figura unaElipse) {
		return Double.compare(getArea(), unaElipse.getArea());

	}

	@Override
	public String toString() {
		return "Elipse [area=" + area + "]";
	}
	
	
}
