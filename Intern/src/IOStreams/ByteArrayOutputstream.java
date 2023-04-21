package IOStreams;
import java.io.*;

public class ByteArrayOutputstream {

	public static void main(String[] args) {
		
		String data="This is byte array addition to the test file";
		
		try {
			ByteArrayOutputStream output=new ByteArrayOutputStream();
			byte[] array=data.getBytes();
			
			output.write(array);
			String streamData=output.toString();
			System.out.println(streamData);
			
			output.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
