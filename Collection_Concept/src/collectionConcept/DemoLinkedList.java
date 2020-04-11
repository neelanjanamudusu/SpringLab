package collectionConcept;
import java.util.LinkedList;
public class DemoLinkedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList l=new LinkedList();
l.add(10);
l.add(0,10.2f);
l.add('n');
l.add("neeluramya");
l.remove(1);
//l.removeAll(l);
System.out.println(l);
LinkedList l1=new LinkedList();
l1.add(20);
l1.add(20.2f);
l1.add('r');
l1.add("ramyaneelu");
System.out.println(l1.get(2));
System.out.println(l1.contains(10));
l1.retainAll(l);
//l1.removeAll(l1);
l1.clear();//remove all nd clear all are of same type
l1.addAll(l);
System.out.println(l1);
	}}
