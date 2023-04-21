package IOStreams;
import java.io.*;

public class FileOutputstream {

	
	public static void main(String[] args) {
		
		String data="This is addition to the test file";
		try {
			FileOutputStream output=new FileOutputStream("D:\\test.txt");
			byte[] array=data.getBytes();
			
			output.write(array);
			
			output.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
