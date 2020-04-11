package data_stream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class DemoDataInputStream {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n;
FileInputStream f= new FileInputStream("new.txt");
DataInputStream d=new DataInputStream(f);
while((n=d.read())!=-1){
	System.out.println((char)n);
	//System.out.println(n);//ASCII values are obtained
}}}
