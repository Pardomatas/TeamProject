import java.io.File;
import java.io.IOException;


public class mkdir {
	public mkdir(String ndir) throws IOException{
		File f = new File(ndir);
		f.mkdir();
		System.out.println("Directory created");
	}
}
