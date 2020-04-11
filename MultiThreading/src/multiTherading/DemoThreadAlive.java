package multiTherading;
public class DemoThreadAlive extends Thread{
	public void run(){
	for(int i=0;i<=5;i++){ //first child thread
		//System.out.println(Thread.currentThread().isAlive());	
		try {
			System.out.println(Thread.currentThread().isAlive());	
			//join();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//if it is here then only main method is executed
		System.out.println("i="+i);
	}}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DemoThreadAlive d=new DemoThreadAlive();
		d.join();//if this is here then main method and child method is executed 
		d.start();
}}
