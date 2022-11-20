package col1;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Cliente> listaC = new ArrayList<Cliente>();
		listaC.add(new Cliente("b", "Vertone", 123, 12000231));
		listaC.add(new Cliente("d", "asda", 234, 12023231));
		listaC.add(new Cliente("c", "Vertfdfone", 345, 14223231));
		listaC.add(new Cliente("b", "Vwene", 456, 7000231));

		System.out.println(listaC);

		listaC.remove(new Cliente("c", "Vertfdfone", 345, 14223231));
		listaC.remove(new Cliente("c", "Vertfdfone", 345, 14223231));
		System.out.println(listaC);


	}

}
