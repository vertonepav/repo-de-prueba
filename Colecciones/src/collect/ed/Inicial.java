package collect.ed;

import java.util.ArrayList;

public class Inicial {
	public static void main(String[] args) {

		ArrayList<Fila> filaGral = new ArrayList<Fila>();
		ArrayList<Fila> filaA = new ArrayList<Fila>();
		ArrayList<Fila> filaB = new ArrayList<Fila>();

		filaGral.add(new Fila(3));
		filaGral.add(new Fila(4));
		filaGral.add(new Fila(5));
		filaGral.add(new Fila(6));
		filaGral.add(new Fila(1));
		filaGral.add(new Fila(9));
		filaGral.add(new Fila(2));
		filaGral.add(new Fila(2));
		filaGral.add(new Fila(11));

		System.out.println("Fila General:" + filaGral);

		for (int i = 0; i < filaGral.size(); i++) {
			if (filaGral.get(i).productosQueTiene() <= 5)
				filaA.add(filaGral.get(i));
			else
				filaB.add(filaGral.get(i));
		}

		System.out.println("#####REACOMODAMOS####");
		System.out.println("Fila A: " + filaA);
		System.out.println("################");
		System.out.println("Fila B: " + filaB);

	}
}
