package empresa;

public class Empleados{
	private int horasTrabajadas;
	private int antiguedad;
	private int hijos;
	private int casado;
	
	public Empleados(int horasTrabajadas, int antiguedad, int hijos, boolean casado) {
		this.horasTrabajadas = horasTrabajadas;
		this.antiguedad = antiguedad;
		this.hijos = hijos;
		if(casado) this.casado = 100;
		else this.casado = 0;
	}
	
	
	
}
