package ejercicioseis.encapsulamiento;

public class Principal {

	public static void main(String[] args) {
		TarjetaBaja tarjeta1 = new TarjetaBaja(90);
		TarjetaBaja tarjeta2 = new TarjetaBaja(17);
		
		tarjeta1.pagarViajeEnSubte();
		tarjeta1.pagarViajeEnColectivo();
		tarjeta1.pagarViajeEnSubte();
		tarjeta2.pagarViajeEnSubte();
		
		System.out.println(tarjeta1.contarViajes());
		
		
	}

}
