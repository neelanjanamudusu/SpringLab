package object_stream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Demo implements Serializable{
	 transient int a=19;
	int b=20;
}
public class DemoSerializable {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
	Demo d=new Demo();
	FileOutputStream f=new FileOutputStream("hello.kji");
	ObjectOutputStream o=new ObjectOutputStream(f);
	o.writeObject(d);
	FileInputStream f1=new FileInputStream("hello.kji");
	ObjectInputStream o1=new ObjectInputStream(f1);
	Demo d1=(Demo)o1.readObject();
	System.out.println(d1.a+" "+d1.b);
	
	}}
