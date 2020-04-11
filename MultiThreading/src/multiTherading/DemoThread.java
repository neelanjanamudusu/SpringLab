package multiTherading;
public class DemoThread extends Thread {
	public void run(){
		for(int i=0;i<=5;i++){ //first child thread
			/*try {
				//Thread.sleep(2000);
				join();//if it is here then only main method is executed
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			System.out.println("i="+i);
		}
		/*for(int j=0;j<=5;j++){ //second
			System.out.println("j="+j);
		}
	for(int k=0;k<=5;k++){  //third
		System.out.println("k="+k);
	}*/}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
DemoThread d=new DemoThread();
d.join();//if this is here then main method and child method is executed 
d.start();
//d.join();//if this is here the child thread and main method executed
for(int j=0;j<=5;j++){ //second
	System.out.println("j="+j);
}}}
