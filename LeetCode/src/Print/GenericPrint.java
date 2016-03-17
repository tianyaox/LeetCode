package Print;

import java.util.ArrayList;
import java.util.List;

public class GenericPrint {
	public static void main(String[] args){
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		GenericPrint.print(l);
	}
	public static <E> void print(E obj){
		System.out.println(obj);
	}
}
