package orquesta;

public class Percusion extends Instrumento {

	public Percusion(String nombre, double precio) {
		super(nombre, precio);
	}

	@Override
	public void afinar() {
		System.out.println("Este instrumento de percusion, " + getNombre() + ", está afinado");

	}

}
