package ejercciouno.encapsulamiento;

public class MainUno {

	public static void main(String[] args) {
		Nota a1 = new Nota(3);
		
		if(a1.obtenerValor() >= 0 && a1.obtenerValor() <= 10) {
			System.out.println(a1.aprobado());
		} else 
			System.out.println("No es una nota evaluable.");
		
		a1.recuperar(7);
		System.out.println(a1.obtenerValor());
		
		a1.recuperar(5);
		System.out.println(a1.obtenerValor());
		
		a1.recuperar(8);
		System.out.println(a1.obtenerValor());
	}
}