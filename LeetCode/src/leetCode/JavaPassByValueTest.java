package leetCode;

import java.util.*;

public class JavaPassByValueTest {
	public static void main(String[] args){
		Integer i = 0;
		JavaPassByValueTest j = new JavaPassByValueTest(); 
		j.plus1(i);
		j.plus2(i);
		System.out.println(i);
		
		List<Integer> l = new ArrayList<Integer>();
		j.push1(l);
		j.push2(l);
		System.out.println(l.toString());
		
		
	}
	public void plus1(Integer i){
		i+=1;
	}
	public void plus2(Integer i){
		i+=2;
	}
	
	public void push1(List<Integer> l){
		l.add(1);
	}
	public void push2(List<Integer> l){
		l.add(2);
	}
}
