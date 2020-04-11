package collectionConcept;
import java.util.ArrayList;
public class DemoArrayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a=new ArrayList();//we can give heterogeneous type data is accepted
a.add(10);
a.add(10.2f);
a.add('c');
//a.removeAll(a);
System.out.println(a);
ArrayList <String> a1=new ArrayList<String>();//generic type==we can insert only homogeneous type data
a1.add("neeluramya");
a1.add("anurag");
a1.add("cvsr");
a1.add("musthafa");
a1.remove(1);
System.out.println(a1.get(2));
//a1.retainAll(a);
a1.clear();
System.out.println(a1.contains(10));
a1.addAll(a);
System.out.println(a1);
	}}