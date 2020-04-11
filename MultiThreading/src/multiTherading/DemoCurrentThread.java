package multiTherading;
public class DemoCurrentThread extends Thread {
	public void run(){
		for(int i=0;i<=5;i++){ //first child thread
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread.currentThread().setName("1st child thread");
			Thread.currentThread().setPriority(2);
			System.out.println(Thread.currentThread());
			System.out.println(Thread.currentThread().getName());
			System.out.println("i="+i);
		}
		for(int k=0;k<=5;k++){ //second child thread
			Thread.currentThread().setName(" 2nd child thread");
			Thread.currentThread().setPriority(3);
			System.out.println(Thread.currentThread());
			System.out.println(Thread.currentThread().getName());
			System.out.println("k="+k);
		}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoCurrentThread d=new DemoCurrentThread();
		d.start();
		for(int j=0;j<=5;j++)
		{
			Thread.currentThread().setName("main thread");
			Thread.currentThread().setPriority(1);
			System.out.println(Thread.currentThread());
			System.out.println(Thread.currentThread().getPriority());
			System.out.println("j="+j);
			}}}
