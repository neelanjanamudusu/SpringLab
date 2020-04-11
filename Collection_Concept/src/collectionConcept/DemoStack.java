package collectionConcept;
import java.util.Enumeration;
import java.util.Stack;
public class DemoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack names=new Stack();
		names.push("neeluRamya");
		names.push("anurag");
		names.pop();
		names.push("cvsr");
		names.push(436);
		System.out.println(names.peek());
		
		/*Iterator<String> namesIterator=names.iterator();
		while(namesIterator.hasNext())
		{
			System.out.println(namesIterator.next());
		}*/
		
		Enumeration v=names.elements();
		while(v.hasMoreElements()){
			System.out.println(v.nextElement());
		}
	}

}
