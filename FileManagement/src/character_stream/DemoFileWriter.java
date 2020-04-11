package character_stream;
import java.io.FileWriter;
import java.io.IOException;
public class DemoFileWriter {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f=new FileWriter("new.txt");
f.write("neeluramya\n");
f.write("mom dad\n");
f.write("1234");
f.flush();//for output stream
f.close();
	}}
