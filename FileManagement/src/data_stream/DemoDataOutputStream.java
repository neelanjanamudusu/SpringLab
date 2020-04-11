package data_stream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class DemoDataOutputStream {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream f=new FileOutputStream("new.txt");
		DataOutputStream d=new DataOutputStream(f);
		d.writeInt(36);
		d.writeFloat(97.5f);
		d.writeUTF("neeluramya");
		d.flush();
        d.close();
	}}
