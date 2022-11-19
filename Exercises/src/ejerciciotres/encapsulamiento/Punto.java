package ejerciciotres.encapsulamiento;

public class Punto {
	private double posicionX, posicionY;

	public Punto(double posicionX, double posicionY) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}

	public double obtenerX() {
		return this.posicionX;
	}

	public double obtenerY() {
		return this.posicionY;
	}

	public void cambiarX(double nuevoX) {
		this.posicionX = nuevoX;
	}

	public void cambiarY(double nuevoY) {
		this.posicionY = nuevoY;
	}
	
	//retorna "true" si el punto esta sobre la abscisa
	
	public boolean estaSobreEjeX() {
		return (this.posicionY == 0);
	}
	
	//retorna "true" si el punto esta sobre la ordenada
	
	public boolean estaSobreEjeY() {
		return (this.posicionX == 0);
	}
	
	//retorna "true" si el punto esta sobre el origen
	
	public boolean esElOrigen() {
		return (this.posicionX == 0 && this.posicionY == 0);
	}
}
