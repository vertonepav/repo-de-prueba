package ejerciciosdelistas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class UsosDeListas {
	private ArrayList<Integer> listaTres;

	public UsosDeListas() {
		listaTres = new ArrayList<Integer>(0);
	}

	public void enterosOrdenados(ArrayList<Integer> listaUno, ArrayList<Integer> listaDos) {
		listaTres.addAll(0, listaUno);
		listaTres.addAll(listaUno.size(), listaDos);
		Collections.sort(listaTres);
	}

	public void eliminarDuplicados() {
		ArrayList<Integer> aux = new ArrayList<Integer>();

		for (int i = 0; i < listaTres.size() - 1; i++) {
			if (i == listaTres.size() - 2) // tamaño - 2 evita el desbordamiento y se agrega ultimo elemento cuando sea
											// true
				aux.add(listaTres.get(listaTres.size() - 1));
			else if (listaTres.get(i) != listaTres.get(i + 1)) // pasa por else Tamaño - 3 veces
				aux.add(listaTres.get(i));
		}
		listaTres = aux;
	}

	public void invertirLista(ArrayList<Integer> lo) {
		Stack<Integer> pila = new Stack<Integer>();
		for (int i = 0; i < lo.size(); i++) {
			pila.push(lo.get(i));
		}

		lo.clear();

		for (int i = pila.capacity(); i > 0; i--) {
			if (!(pila.isEmpty())) {
				lo.add(pila.peek());
				pila.pop();
			}
		}
	}

	public void contenidoEn(ArrayList<Integer> li) {

	}

	@Override
	public String toString() {
		return "UsosDeListas [a=" + listaTres + "]";
	}

}
