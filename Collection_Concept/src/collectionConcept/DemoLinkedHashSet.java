package collectionConcept;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoLinkedHashSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet h=new LinkedHashSet();
		h.add(10);
		h.add(20.2f);
		h.add(10);
		h.add("neeluramya");
		h.add('k');
		h.add('l');
		LinkedHashSet h1=new LinkedHashSet();
		h1.add(100);
		h1.addAll(h);
		System.out.println(h1);
		Iterator i=h1.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		}}
