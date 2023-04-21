package Files;
import java.io.*;

public class Main1 {

	public static void main(String[] args) {
		int data1=1;
		String data2="This is object Stream";
		
		try {
			
			FileOutputStream file=new FileOutputStream("d:\\test.txt");
			ObjectOutputStream output=new ObjectOutputStream(file);
			
			output.writeInt(data1);
			output.writeObject(data2);
			
			FileInputStream fileStream=new FileInputStream("d:\\test.txt");
            ObjectInputStream objStream= new ObjectInputStream(fileStream);
            
            System.out.println(objStream.readInt());
            System.out.println(objStream.readObject());
            output.close();
            objStream.close();
					
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
