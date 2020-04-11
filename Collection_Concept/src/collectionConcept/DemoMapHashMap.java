package collectionConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DemoMapHashMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap h=new HashMap();
h.put(101,"neelu reddy");
h.put(110, "value");
h.put(100,"ramya");
Scanner s=new Scanner(System.in);
h.replace(110, "value", s.next());
HashMap h1=new HashMap();

System.out.println(h);
h1.putAll(h);
System.out.println(h1.remove(102));
System.out.println(h1.get(103));
System.out.println(h1.isEmpty());
System.out.println(h1.containsKey(103));
System.out.println(h1.size());
//for(Map.Entry I:h.entrySet())
Set set=h.entrySet();
Iterator i=set.iterator();
while(i.hasNext()){
	Map.Entry entry=(Map.Entry)i.next();
	System.out.println(entry.getKey()+" "+entry.getValue());
}}}
