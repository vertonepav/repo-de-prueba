package parcialdos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
	public static void main(String[] args) throws IOException {
		
	Infractores<Integer> a = new Infractores<>();
	List<Integer> lu = 
		new ArrayList<Integer>(Arrays.asList(4, 5));
	List<Integer> ld = 
		new ArrayList<Integer>(Arrays.asList(3, 1, 4, 1, 3));
	
	a.diferencia(lu, ld);
	System.out.println(a);
	}
}
