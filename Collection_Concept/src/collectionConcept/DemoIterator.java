package collectionConcept;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class DemoIterator{
	public static void main(String[] args) {
		List<String> names=new LinkedList<String>();
		names.add("neeluRamya");
		names.add("anurag");
		names.add("cvsr");
		//names.add("musthafa");
		Iterator<String> namesIterator=names.iterator();
		while(namesIterator.hasNext())
		{
			System.out.println(namesIterator.next());
		}

	}
}