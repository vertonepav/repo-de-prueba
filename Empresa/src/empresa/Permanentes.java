package empresa;

public class Permanentes extends Empleados {
	
	public Permanentes(int horasTrabajadas, int antiguedad, int hijos, boolean casado) {
		super(300 * horasTrabajadas, 100 * antiguedad, 200 * hijos, casado);
	}

	
}
