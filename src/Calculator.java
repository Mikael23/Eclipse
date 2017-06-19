import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	 private static final String EXIT = "exit";

	    private static String readUserInput(BufferedReader in) throws IOException {
	        System.out.print("Enter 2 space-separated integers or 'exit': ");
	        
	        String result = in.readLine();
	        
	        return result;
	    }
	    
	    public static void main(String[] args) throws Exception {
	        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
	        
	        for (String userInput = readUserInput(in);
	            !EXIT.equals(userInput); userInput = readUserInput(in)) {
	            
	            String[] tokens = userInput.split(" ");
	            
	            if (tokens.length == 2) {
	                try {
	                    int m = Integer.parseInt(tokens[0]);
	                    int n = Integer.parseInt(tokens[1]);
	                    
	                    System.out.println("Sum: " + (m + n));
	                } catch (NumberFormatException e) {
	                    System.out.println("Not a number");
	                }
	            } else {
	                System.out.println("2 numbers expected");
	            }
	        }
	        
//	        
//	        String userInput = readUserInput(in);
//	        
//	        while (!EXIT.equals(userInput)) {
//	            // <BODY>
//	            userInput = readUserInput(in);
//	        }
//	        
//	        
//	        String userInput;
//	        
//	        while (!EXIT.equals((userInput = readUserInput(in)))) {
//	            // <BODY>
//	        }
	    }
}
