package character_stream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class DemoBufferedReader {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
int n;
FileReader f=new FileReader("new.txt");
BufferedReader b=new BufferedReader(f);
while((n=f.read())!=-1)
{
	System.out.println((char)n);//till the end to print all the characters
}}}
