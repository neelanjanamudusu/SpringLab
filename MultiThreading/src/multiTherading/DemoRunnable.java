package multiTherading;

public class DemoRunnable implements Runnable {
public void run(){
	for(int i=0;i<=5;i++){
		System.out.println("i="+i);
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoRunnable d=new DemoRunnable();
		Thread t=new Thread(d);
		t.start();
		for(int j=0;j<=5;j++)//main thread
		{
			System.out.println("j="+j);
		}
	}}