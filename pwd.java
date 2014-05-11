import java.io.File;
import java.io.IOException;


public class pwd {
	public pwd() throws IOException{
		File f = new File(".");
		System.out.println(f.getCanonicalPath());
	}

}
