import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderDemo {
	
	    public static void main(String[] args) throws Exception {
	        BufferedReader in = new BufferedReader(new FileReader("readme.txt"));
	        
	        for (String s = in.readLine(); s != null; s = in.readLine()) {
	            System.out.println(s);
	        }
	        in.close();
	    }
}
