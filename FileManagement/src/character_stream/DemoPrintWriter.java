package character_stream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class DemoPrintWriter {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter f=new FileWriter("new.txt");
PrintWriter p=new PrintWriter(f);
p.println("neelu ramya");
p.println("how are u");
p.close();
	}}
