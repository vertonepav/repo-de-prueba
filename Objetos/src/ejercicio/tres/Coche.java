package ejercicio.tres;

public class Coche {

	private int puertas;
	
	public Coche() {
		puertas= 0;
	}

	public void addPuertas() {
		puertas++;
	}

	@Override
	public String toString() {
		return "Cantidad de puertas: " + puertas;
	}

}
