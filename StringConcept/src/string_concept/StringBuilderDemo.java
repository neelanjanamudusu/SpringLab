package string_concept;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder s=new StringBuilder("hello  ");
s.append("world  ");
s.insert(3,"world  ");
s.replace(1, 2, "ramya  ");
//s.delete(1, 4);
//s.reverse();
System.out.println(s);
	}

}
