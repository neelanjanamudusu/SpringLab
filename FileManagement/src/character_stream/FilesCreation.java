package character_stream;

import java.io.File;
import java.io.IOException;
public class FilesCreation {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f=new File("new.txt");
f.createNewFile();
System.out.println(f.exists());
	}}
//after running the code go to file and click on refresh
//the created file is shown under the JRE system library