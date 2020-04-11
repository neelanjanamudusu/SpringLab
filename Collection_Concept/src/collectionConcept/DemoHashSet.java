package collectionConcept;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoHashSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet h=new HashSet();
h.add(10);
h.add(20.2f);
h.add(10);
h.add("neeluramya");
h.add('k');
h.add('l');
//h.remove(36);
//h.removeAll(h);
h.retainAll(h);
HashSet h1=new HashSet();
h1.add(100);
h1.addAll(h);
System.out.println(h.contains(36));
System.out.println(h1);
Iterator i=h1.iterator();
while(i.hasNext()){
	System.out.println(i.next());
}
}}
