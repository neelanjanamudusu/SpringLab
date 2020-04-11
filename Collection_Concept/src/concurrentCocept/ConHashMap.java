package concurrentCocept;
import java.util.HashMap;
public class ConHashMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap h=new HashMap();
h.put(101, "ajay");
h.putIfAbsent(102, "vijay");
h.put(103, "neelu");
h.putIfAbsent(104, "ramya");
h.replace(101, "ajay", "vijay");
h.remove(103,"neelu");
System.out.println(h);
	}}
