package ejerciciotres.encapsulamiento;

public class MainTres {

	public static void main(String[] args) {
		Punto p1 = new Punto(0, 33);
		
		System.out.println("Coordenadas de p1: " + "(" + p1.obtenerX() + 
				", " + p1.obtenerY() + ")");
		
		System.out.println("\nEn que posicion está p1? ");
		
		if(p1.esElOrigen()) System.out.println("Esta en el origen.");
		else if(p1.estaSobreEjeX()) System.out.println("Esta en el eje de abscisas.");
		else if(p1.estaSobreEjeY()) System.out.println("Esta en el eje de ordenadas.");
		else System.out.println("Esta en la posicion: " + "(" + p1.obtenerX() + 
				", " + p1.obtenerY() + ")");
		
		p1.cambiarX(0);
		p1.cambiarY(0);
		System.out.println("Se reseteó a la posicion: " + "(" + p1.obtenerX() + 
				", " + p1.obtenerY() + ")");
		
		
	}

}
