package collectionConcept;

import java.util.Vector;

public class DemoVector {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v=new Vector();
v.add(10);
v.add(11);
v.add(90);
v.remove(0);
v.add("neeluramya");
v.add(10);
v.add(36);
System.out.println(v.contains(11));
System.out.println(v.elementAt(2));
System.out.println(v);
v.removeAllElements();
System.out.println(v);
System.out.println(v.capacity());
	}

}
