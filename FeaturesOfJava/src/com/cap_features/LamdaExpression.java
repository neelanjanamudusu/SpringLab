package com.cap_features;
interface Demo{
	int sum(int a,int b);
}
public class LamdaExpression implements Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo d=(a,b)->a+b;
System.out.println(d.sum(10, 20));
	}

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}}
