package character_stream;
import java.io.FileReader;
import java.io.IOException;
public class DemoFileReader {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
int n;
FileReader f=new FileReader("new.txt");
while((n=f.read())!=-1)
{
	System.out.println((char)n);//till the end to print all the characters
}}}
