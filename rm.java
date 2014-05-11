import java.io.File;
import java.io.IOException;

public class rm {
	public rm(String file) throws IOException{
		f(file);
	}
	private void f(String s) throws IOException{
		File file = new File(s.trim());
		if (file.exists()) {
		    file.delete();
		    System.out.println("The file: '" + file + "' ('" + file.getAbsolutePath() + "') has been deleted.");
		} else {
		    System.err.println("The file: '" + file + "' ('" + file.getAbsolutePath() + "') cannot be found.");
		}
	}
}