package ejerciciocuatro.encapsulamiento;

public class MainCuatro {

	public static void main(String[] args) {
		
		Circulo c = new Circulo(2);
		
		System.out.println(c.getRadio());
		System.out.println(c.perimetro());
		System.out.println(c.diametro());
		System.out.println(c.area());
		
		c.setRadio(4.12);
		System.out.println("\n" + c.perimetro());
		System.out.println(c.diametro());
		System.out.println(c.area());
	}

}
