package demoCloneable;
class A implements Cloneable{
	int i;
	String s;
	public A(int i,String s){
		this.i=i;
		this.s=s;
	}
	protected Object Clone()
		throws CloneNotSupportedException{
			return super.clone();
		}}
public class DemoCloneable {
	public static void main(String[] args) 
		// TODO Auto-generated method stub
		throws CloneNotSupportedException
		{
			A a=new A(20,"capgemini");
		    A b=(A)a.Clone();
		    System.out.println(b.i);
		    System.out.println(b.s);
		}}


