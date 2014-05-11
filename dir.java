import java.io.*;
import java.text.SimpleDateFormat;

public class dir {
	public dir() throws IOException{
		f();
	}

	private void f() throws IOException{
			try{
				File f = new File(".");
				
				File [] files = f.listFiles();
				for (File file :files){
					if(file.isDirectory())
						System.out.print("directory:");
					else
						System.out.print("file:");
					
					SimpleDateFormat mdy = new SimpleDateFormat ("MM/dd/yyyy");				
					System.out.println(file.getCanonicalPath() + "\t Size:" + file.length() + " bytes \t last modified:" + mdy.format(file.lastModified()));
				}
			}
			catch(IOException e)
			{
				System.out.println(e);
			}	
	}
}
