package Files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {
		Path path=(Path)Paths.get("d:\\","directory");
        System.out.println(path);

	}

}
