package parcialdos;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Infractores<T> {

	private static final int VELOCIDAD_MAX = 80;
	private static final int MULTA = 50000;
	private Map<String, Integer> infractores;
	List<T> l3;

	public Infractores() {
		infractores = new HashMap<String, Integer>();
		l3 = new ArrayList<T>();
	}

	public void leerInfractores(String entrada) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(entrada));
		String line = "";
		String patente;
		int velocidad;

		while ((line = br.readLine()) != null) {
			String[] split = line.split(" ");
			patente = split[0];
			velocidad = Integer.parseInt(split[1]);

			if (velocidad > VELOCIDAD_MAX) {
				int cantidad = 1;
				if (infractores.containsKey(patente))
					cantidad += infractores.get(patente);
				infractores.put(patente, cantidad);
			}
		}
		// ---
		br.close();
	}

	public void escribirMultados(String salida) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(salida));
		String escribirLinea;

		for (Map.Entry<String, Integer> rec : infractores.entrySet()) {
			escribirLinea = rec.getKey() + " " + rec.getValue() * MULTA;
			bw.write(escribirLinea);
			bw.newLine();
		}

		// ---
		bw.close();
	}

	public List<T> diferencia(List<T> l1, List<T> l2) {
			
		if(l1.equals(l2))
			return null;

		if (l1.size() >= l2.size()) {
			
			for(T recorroL1 : l1)
				if(!l2.contains(recorroL1)) {
					l3.add(recorroL1);
				}
			
			return l3;
		} else {
			for(T recorroL2 : l2)
				if(!l1.contains(recorroL2)) {
					l3.add(recorroL2);
				}
			return l3;
		}

	}
	

	@Override
	public String toString() {
		return "" + l3;
	}
}
