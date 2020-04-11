package byte_stream;
import java.io.FileInputStream;
import java.io.IOException;
public class DemoFileInputStream {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n;
		//FileInputStream f=new FileInputStream("new.txt");
	//FileInputStream f=new FileInputStream("download.jpg");//image file
	//perform a video one
		FileInputStream f=new FileInputStream("DemoConcat.class");
		while((n=f.read())!=-1){
			System.out.println(n);
		}}}
