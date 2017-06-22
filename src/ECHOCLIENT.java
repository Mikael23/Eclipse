import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class ECHOCLIENT {
	private static String readUserInput(BufferedReader scaner) throws IOException {
        System.out.print("Enter text or 'exit': ");
        return scaner.readLine();
    }
	public static void main(String[] args) throws IOException {
		
		String serverhostname = "localhost";
		int serverport = 3000;
   	          BufferedReader scanner1 = new BufferedReader(new InputStreamReader(System.in));

		    	 Socket socket = new Socket(serverhostname,serverport);
		    	 BufferedReader scanner = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		    	 PrintWriter out = new PrintWriter(socket.getOutputStream());
		     for(String s = readUserInput(scanner1); !"exit".equals(s); s = readUserInput(scanner1)){
		    	 System.out.println(s);
		    	 out.println(s);
		    	 System.out.print(scanner.readLine());
		     }
		

	}

}
