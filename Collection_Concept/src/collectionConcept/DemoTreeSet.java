package collectionConcept;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoTreeSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet t=new TreeSet();
t.add(10);
t.add(11);
t.add(10);
t.add(12);
System.out.println(t);
Iterator i=t.iterator();
while(i.hasNext()){
	System.out.println(i.next());
}}}
