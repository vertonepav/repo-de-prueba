package collect.et;

import java.util.Objects;

public class Producto {
	private int codigo;
	private String descripcion;
	private double importe;
	private int stock;

	public Producto(int codigo, String descripcion, double importe, int stock) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.importe = importe;
		this.stock = stock;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		if (importe >= 0)
			this.importe = importe;
		else
			throw new Error("No se trata de un importe aceptado");
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void incrementarImporte(double porcentaje) {
		double incremento = importe * porcentaje / 100;
		importe += incremento;

	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", importe=" + importe + ", stock="
				+ stock + "]";
	}

}
