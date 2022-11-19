package parcialdos;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//PABLO VERTONE
//UNIVERSIDAD NACIONAL DEL OESTE - T.N

public class Ventas {

	private Map<String, Integer> ventasPorProducto;

	public Ventas() {
		ventasPorProducto = new HashMap<String, Integer>();
	}

	public void leerVentas(String entrada) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(entrada));
		String lineasLeidas = "";
		String codigo;
		int cantidad;

		while ((lineasLeidas = br.readLine()) != null) {
			String[] split = lineasLeidas.split(" ");
			codigo = split[0];
			cantidad = Integer.parseInt(split[1]);

			if (!ventasPorProducto.containsKey(codigo)) {
				ventasPorProducto.put(codigo, cantidad);
			} else {
				cantidad += ventasPorProducto.get(codigo);
				ventasPorProducto.put(codigo, cantidad);
			}

		}

		// --
		br.close();
	}

	public void escribirVentasPorProducto(String salida) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(salida));
		String escribirLinea;

		for (Map.Entry<String, Integer> rec : ventasPorProducto.entrySet()) {
			escribirLinea = rec.getKey() + " " + rec.getValue();
			bw.write(escribirLinea);
			bw.newLine();
		}

		// ---
		bw.close();

	}

	public <T> List<T> DiferenciaSimetrica(List<T> l1, List<T> l2) {
		List<T> l3 = new ArrayList<T>();

		for (T recorre1 : l1) {
			if (!l2.contains(recorre1)) {
				l3.add(recorre1);
			}

		}

		for (T recorre2 : l2) {
			if (!l1.contains(recorre2)) {
				l3.add(recorre2);
			}
		}

		return l3;
	}

}
