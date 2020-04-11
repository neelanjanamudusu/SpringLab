package collectionConcept;
import java.util.Iterator;
import java.util.PriorityQueue;
public class DemoPriorityQueue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue p=new PriorityQueue();
		p.add("neeluramya");
		p.add("neelu");
		p.add("ramya");
		//p.add(436);
		System.out.println(p.element());
		System.out.println(p.peek());
		System.out.println("after the element and peek");
		Iterator i=p.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		p.remove();
		p.poll();
		System.out.println("after the poll and remove");
		Iterator i1=p.iterator();
		while(i1.hasNext()){
			System.out.println(i1.next());
		}}}
