package col1;

import java.util.Objects;

public class Cliente implements Comparable<Cliente> {
	private String nombre;
	private String apellido;
	private int telefono;
	private int dni;

	public Cliente(String nombre, String apellido, int telefono, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.dni = dni;
	}

	@Override
	public String toString() {
		return apellido + " " + nombre + " " + telefono;
	}

	@Override
	public int compareTo(Cliente other) {
		if (apellido.equals(other.apellido))
			return nombre.compareTo(other.nombre);
		return apellido.compareTo(other.apellido);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cliente))
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(apellido, other.apellido);
	}

}
