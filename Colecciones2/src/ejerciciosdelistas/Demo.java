package ejerciciosdelistas;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		UsosDeListas a = new UsosDeListas();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();

		l1.add(3);
		l1.add(2);
		l1.add(1);
		l2.add(8);
		l2.add(9);
		l2.add(10);
		l1.add(23);
		l1.add(23);
		l1.add(20);
		l1.add(25);
		l1.add(23);
		l2.add(6);
		l2.add(7);
		l2.add(40);
		

		a.enterosOrdenados(l1, l2);

		System.out.println(a);

		l1.add(22);
		a.enterosOrdenados(l1, l2);

		System.out.println(a);

		int suma = 0;
		for (Integer it : l1) { 
			suma += it;
		}
		
		System.out.println(suma);
		
		a.eliminarDuplicados();

		System.out.println(a);
		System.out.println("#############");
		System.out.println(l1);
		
		a.invertirLista(l1);
		System.out.println(l1);

	}

}
