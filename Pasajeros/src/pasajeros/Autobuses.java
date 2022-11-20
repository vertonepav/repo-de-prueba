package pasajeros;

public class Autobuses extends Vehiculos {

	@Override
	public void cambiarChofer(Viajantes cantidad) {
		if(cantidad.cantidadViajantes() > 0)
			System.out.println("Hay pasajeros en el autobus");
		else
			System.out.println("El nuevo chofer se llama" + asignarChofer());
	}

}
