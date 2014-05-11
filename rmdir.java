import java.io.File;
import java.io.IOException;

public class rmdir {
	public rmdir(String dir) throws IOException{
		f(dir);
	}
	private void f(String s) throws IOException{
		File dir = new File(s.trim());
		if(dir.exists()){
			if(dir.isDirectory()){
				if(dir.list().length>0){
					System.err.println("The directory " + dir + " is not empty.");
				} else {
					dir.delete();
					System.out.println(dir + " has been deleted");
				}
			} else {
				System.err.println(dir + " is not a directory.");
			}
	    } else {
	    	System.err.println("Dictionary " + dir + " does not exits.");
	    }
	}
}
