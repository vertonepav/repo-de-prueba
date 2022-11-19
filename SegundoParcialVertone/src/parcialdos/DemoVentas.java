package parcialdos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//PABLO VERTONE
//UNIVERSIDAD NACIONAL DEL OESTE - T.N

public class DemoVentas {
	public static void main(String[] args) throws IOException {
		Ventas mv = new Ventas();

		mv.leerVentas("ventas.in.txt");
		mv.escribirVentasPorProducto("ventas.out.txt");

		List<Integer> lu = new ArrayList<Integer>(Arrays.asList(3, 4, 6, 12));
		List<Integer> ld = new ArrayList<Integer>(Arrays.asList(4, 5, 1, 3, 4, 6));
		List<Integer> lt;

		lt = mv.DiferenciaSimetrica(lu, ld);

		System.out.println(lt);

	}
}
