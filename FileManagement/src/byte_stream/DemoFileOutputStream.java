package byte_stream;
import java.io.FileOutputStream;
import java.io.IOException;
public class DemoFileOutputStream {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream f=new FileOutputStream("new.txt");
		f.write(36);
		f.write(97);
		f.write('A');
		f.flush();
	}}
