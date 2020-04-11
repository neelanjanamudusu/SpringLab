package multiTherading;
public class DemoMultiThreading extends Thread{
public void run(){//child thread
	for(int i=0;i<=3;i++)
	{
		System.out.println("i="+i);
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoMultiThreading d=new DemoMultiThreading();//Initialization of a thread or starting state
		DemoMultiThreading d1=new DemoMultiThreading();
		d.start();//runnable state
		d1.start();
		for(int j=0;j<=5;j++)//main thread
		{
			System.out.println("j="+j);
		}}}
