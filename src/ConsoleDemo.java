import java.io.Console;

public class ConsoleDemo {

	
	    public static void main(String[] args) {
	        Console con = System.console();
	        String name = con.readLine("Enter name: ");
	        String password = new String(con.readPassword("Enter password: "));
	        
	        con.printf("User: %s, password: %s%n", name, password);
//	        System.out.printf("Bye!");
	    }
	


	}


