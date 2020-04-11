package character_stream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class DemoBufferedWriter {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f=new FileWriter("new.txt");
		BufferedWriter b=new BufferedWriter(f);
		b.write("neelu ramya ");
		b.append("mom dad");
		b.newLine();
		b.write("1234");
		b.flush();
		b.close();
	}}
