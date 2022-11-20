package pasajeros;

public abstract class Vehiculos {
	private double kilometraje;

	public Vehiculos() {

	}
	
	public final String asignarChofer(String nombreChofer) {
		return nombreChofer;
	}
	
	public abstract void cambiarChofer(Viajantes cantidad);
	
	public double obtenerKilometraje() {
		return kilometraje;
	}
}
