package vehicle;

public class VehiculoCliente implements Vehiculo {
	private String id;

	public VehiculoCliente(String id) {
		this.id = id;
	}

	@Override
	public double factura() {
		Vehiculo.TIEMPO = 3;
		
		return 0;
	}

	@Override
	public boolean hayPlaza() {
		// TODO Auto-generated method stub
		return false;
	}

}
