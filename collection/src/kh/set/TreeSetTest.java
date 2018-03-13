package kh.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();

		ts.add("javascript");
		ts.add("jQuery");
		ts.add("oracle");
		ts.add("html");
		ts.add("css");
		System.out.println(ts);
		Iterator<String> iter = ts.iterator();
		
		String result = "";
		while(iter.hasNext()){
			if((result = iter.next()).equals("html")){
				 break;
			}
		}
		System.out.println(result);

	}

}
