package ejerciciocuatro.encapsulamiento;

public class Circulo {
	private double radio, PI;

	public Circulo(double radio) {
		this.radio = radio;
		this.PI = 3.14;
	}
	
	public double perimetro() {
		return (this.radio * PI * 2);
	}
	
	public double area() {
		return (this.radio * this.radio * PI);
	}
	
	public double diametro() {
		return (this.radio * 2);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
}
