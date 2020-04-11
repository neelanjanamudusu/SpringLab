package com.cap_features;
interface Demo1{
	void info();
	default void dispaly(){
		System.out.println("default mehtod");
	}
	static void display1g(){
		System.out.println("static method");
	}
	/*public void display2(){
		System.out.println("public mehtod");
	}
*/
}
public class DemoFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
