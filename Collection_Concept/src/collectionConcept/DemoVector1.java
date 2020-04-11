package collectionConcept;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class DemoVector1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add(10);
		v.add(11);
		v.add("neeluramya");
		System.out.println(v);
		System.out.println(v.capacity());
//Iterator i=v.iterator();
		Enumeration e=v.elements();
while(e.hasMoreElements()){
	System.out.println(e.nextElement());
}
	}

}
