package collectionConcept;

import java.util.Stack;

public class DemoStack1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack s=new Stack();
s.push(10);
s.push(001);
s.push(436);
System.out.println(s.peek());
System.out.println(s);
s.remove(0);
s.pop();
System.out.println(s);
	}

}
