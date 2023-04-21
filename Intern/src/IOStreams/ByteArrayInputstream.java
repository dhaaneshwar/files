package IOStreams;
import java.io.ByteArrayInputStream;

public class ByteArrayInputstream {

	public static void main(String[] args) {
		
		try {
			byte[] arr= {1,2,3,4,5};
			
			ByteArrayInputStream input=new ByteArrayInputStream(arr);
			
			 /*System.out.println(input.available());
	            input.read();
	            input.read();
	            System.out.println(input.available());*/
			
			for(int i=0;i<arr.length;i++) {
				int data=input.read();
				System.out.println(data+",");
			}
			input.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
