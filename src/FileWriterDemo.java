import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileWriterDemo {
	
	    private static final String EXIT = "exit";
	    
	    public static void main(String[] args) throws Exception {
	        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
	        
	        PrintWriter out = new PrintWriter(new FileWriter("readme.txt"));
	        
//	        BufferedWriter out =
//	            new BufferedWriter(new FileWriter("readme.txt"));
	        
	        for (String s = in.readLine(); !EXIT.equals(s); s = in.readLine()) {
	            out.println(s);
	        }
	        out.close();
	    }
}
