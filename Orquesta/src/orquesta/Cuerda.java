package orquesta;

public class Cuerda extends Instrumento {

	public Cuerda(String nombre, double precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afinar() {
		System.out.println("Este instrumento de cuerda llamado " + getNombre() + " está afinado");

	}

}
