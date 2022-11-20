package arch1;

public class Spliteando {

	public static void main(String[] args) {
		String datosPer = "38089390 Julian 36";
		String [] spliteo = datosPer.split(" ");
		
		String nombre = spliteo[1];
		Integer dni = Integer.parseInt(spliteo[0]);
		Integer edad = Integer.parseInt(spliteo[2]);
		
		System.out.println("Nombre : " + nombre);
		System.out.println("DNI : " + dni);
		System.out.println("Edad : " + edad);
	}

}
