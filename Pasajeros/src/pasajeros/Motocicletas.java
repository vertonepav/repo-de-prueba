package pasajeros;

public class Motocicletas extends Vehiculos {

	@Override
	public void cambiarChofer(Viajantes cantidad) {
		if(cantidad.cantidadViajantes() > 0)
			System.out.println("Hay un acompañante en la moto");
		else {
			System.out.println("El nuevo chofer se llama" + asignarChofer());
			
		}
	}

}
