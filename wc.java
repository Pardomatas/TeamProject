import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class wc{
	
	public wc(String command, String args) throws IOException{
		File file = new File(args.substring(args.lastIndexOf(" ")+1).trim());
		
		if(file.exists() != true){
			System.err.println("The file: \"" + file + "\" does not exist.");
		}else{
			if(args.toLowerCase().contains("-m")){
				System.out.println("The file: \"" + file + "\" has " + m(file) + " characters.");
			}else if(args.toLowerCase().contains("-l")){
				System.out.println("The file: \"" + file + "\" has " + l(file) + " lines.");
			}else if(args.toLowerCase().contains("-w")){
				System.out.println("The file: \"" + file + "\" has " + w(file) + " words.");
			}else{
				System.out.println("WC does not support this argument.");
			}
		}
	}
	
	private int m(File file) throws IOException{
		System.out.println("Counting characters in file: \"" + file + "\"");
		Scanner in = new Scanner(new FileReader(file));
		int count = 0;
		
		while(in.hasNext()){
			count += in.nextLine().length();
		}
		return count;
	}
	
	private int l(File file) throws IOException{
		System.out.println("Counting lines in file: " + file);
		Scanner in = new Scanner(new FileReader(file));
		int count = 0;
		
		while(in.hasNext()){
			in.nextLine();
			count++;
		}
		return count;
	}
	
	private int w(File file) throws IOException{
		System.out.println("Counting words in file: " + file);
		Scanner in = new Scanner(new FileReader(file));
		int count = 0;
		
		while(in.hasNext()){
			in.next();
		    count++;
		}
		return count;
	}
}
	