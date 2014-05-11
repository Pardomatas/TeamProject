import java.io.IOException;
import java.util.ArrayList;

public class u{
	
	static ArrayList<String> command = new ArrayList<String>();
	static ArrayList<String> arguments = new ArrayList<String>();
	static int i = 0;
	
	public u(String comm, String args) throws IOException{
		if(comm.equals("u")){
			if(i > 0){
				System.out.println(command.get(i-1) + arguments.get(i-1));
				command.remove(i-1);
				arguments.remove(i-1);
				i--;
			}else{
				System.out.println("No more history.");
			}
		}else{
			i++;
			command.add(comm);
			arguments.add(args);
		}
	}
}