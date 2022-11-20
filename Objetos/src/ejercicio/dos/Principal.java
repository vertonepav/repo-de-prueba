package ejercicio.dos;

public class Principal {

	public static void main(String[] args) {
		Monedero dineroManejado = new Monedero(500);

		dineroManejado.consultarDeposito();

		dineroManejado.depositarDinero(320.2);

		dineroManejado.consultarDeposito();

		dineroManejado.extraerDinero(200.7);

		dineroManejado.consultarDeposito();

	}

}
