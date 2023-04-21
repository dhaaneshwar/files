package IOStreams;

import java.io.FileInputStream;

public class FileInputstream {

	public static void main(String[] args) {
		try {
			FileInputStream input=new FileInputStream("D:\\test.txt");
			
			//input.skip(2);
			int i=input.read();
			
			while(i!=-1) {
				System.out.print((char)i);     //(char)text
				i=input.read();
			}
			
          
			input.close();
		}catch(Exception e){
			System.out.println(e);
		}
		
		
		
		

	}

}
