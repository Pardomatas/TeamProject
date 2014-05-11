import java.io.*;
import java.util.ArrayList;

public class tail{
	public tail(String file) throws IOException{
		f(file);
	}
	private void f(String s) throws IOException{
		File file = new File(s.trim());
		if(file.exists() != true){
			System.err.println("The file: " + file + " does not exist.");
		}else{
			BufferedReader in = new BufferedReader(new FileReader(file));
			ArrayList<String> theList = new ArrayList<String>();
			String line;
			while((line = in.readLine()) != null) {
				theList.add(line);
			}
		
			for(int i = 0; i < theList.size(); i++){
				if(i >= theList.size() - 10) {
					System.out.println(theList.get(i));
				}
			}
			in.close();
		}
	}
}
