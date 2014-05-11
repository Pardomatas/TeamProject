//import java.io.*;
import java.io.IOException;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
    	Scanner keyboard = new Scanner(System.in);
      while(true){
        System.out.print("PROMPT\\>");
        String command = keyboard.next();
        String arguments = keyboard.nextLine();
        new u(command, arguments);	//for U command
          Token token = new Token(command);
          switch (token.kind) {
          	case Token.BIGGER: break;
          	case Token.CAL:new Cal(arguments); break; 	//This is just a hint. You need to change the class Cal to displays the current month calendar.
          	case Token.CAT: break;
          	case Token.ATTRIB: break;
          	case Token.CP: break;
          	case Token.CUT: break;
          	case Token.D: break;
          	case Token.ECHO: break;
          	case Token.EXIT: System.exit(0); break;
          	case Token.FILE: break;
          	case Token.FIND: break;
          	case Token.GREP: break;
          	case Token.HEAD: break;
          	case Token.LINK: break;
          	case Token.LS:new ls(); break;
          	case Token.DIR:new dir(); break;
          	case Token.MAN:new man(arguments); break;
          	case Token.MKDIR:new mkdir(arguments); break;
          	case Token.MV:new mv(arguments); break;
          	case Token.PWD:new pwd(); break;
          	case Token.RM:new rm(arguments); break;
          	case Token.RMDIR:new rmdir(arguments); break;
          	case Token.TAIL:new tail(arguments); break;
          	case Token.U: /*leave empty*/ break;
          	case Token.WC:new wc(command, arguments); break;
          	default: System.out.println("Wrong command.");
          }      
        }
     }
}
