package Files;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*File file=new File("d:\\test1.txt");
		try {
			
			boolean value=file.createNewFile();
			if(value) {
				System.out.println("New file is created");
				
			}else {
				System.out.println("File already exist");
			}
		} catch (Exception e) {
			System.out.println(e);
		}*/
		
		//===============================================================================================
		
		/*char array[]=new char[100];
		
		try {
			FileReader input=new FileReader("d:\\test1.txt");
			input.read(array);
			System.out.println(array);
			input.close();
		}catch(Exception e){
			System.out.println(e);
		}*/
		
		//==================================================================================================
		
		/*String data="This is addition to the file";
		try {
			FileWriter output=new FileWriter("d:\\test1.txt");
			output.write(data);
			System.out.println("Data is written to the file");
			output.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		*/
		
		//=================================================================================================
		
		try {
			
			File file=new File("d:\\directory");
			boolean value=file.mkdir();
			
			if(value) {
				System.out.println("Directory created");
			}else {
				System.out.println("Directory already exist");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
