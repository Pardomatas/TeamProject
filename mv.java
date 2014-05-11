import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;
import java.nio.file.StandardCopyOption;

public class mv {
	public mv(String ndir) throws IOException{
		  f(ndir);
	}
	private void f(String s) throws IOException{
		if (s.equals("")) {
		      System.out.println("java file is missing.");
		      return;
		    }
		    StringTokenizer tok = new StringTokenizer(s);
		    int count = tok.countTokens();
		    String[] args = new String[count];
		    for(int i = 0; i < count; i++){
		    	args[i] = tok.nextToken();
		    }
		    File file = new File(args[0]);
		    File rename = new File(args[1]);
		    
			if(count > 2){
				File dest = new File(args[2]);
				
				String temp1 = file.getAbsolutePath();
				String temp2 = dest.getAbsolutePath();
				
				Path source = Paths.get(temp1);
			    Path target = Paths.get(temp2);
			    
				Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
			}
		    file.renameTo(rename);
		    
	}

}
