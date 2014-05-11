import java.io.*;

public class ls {
	public ls() throws IOException{
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
						
				System.out.println(file.getCanonicalPath());
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}

}
