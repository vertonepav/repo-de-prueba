package parcialuno;

public abstract class Figura implements Comparable<Figura>{
	protected double area;
	
	public abstract double calcularArea();
	
	protected double getArea() {
		return area;
	}
	
}
