import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Echoserver {

	
	private static final int PortNumber = 3000;
	
	
	public static void main(String[] args) throws IOException {
		
     ServerSocket serversocket = new ServerSocket(PortNumber);
     while(true){
     try(
    	 Socket socket = serversocket.accept();
    	 BufferedReader scanner = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    	 PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
     ){
        
     System.out.println("Working socket on port: " + socket.getPort());
     for(String s = scanner.readLine(); s !=null; s = scanner.readLine()){
    	 System.out.println("sdsds");
    	 out.println(s);
    	 System.out.println(count(s));
     }
    	 
     }catch (IOException e) {
         System.out.println("Connection broken");
     }	 
	}
	}
    	 public static String count(String line){
			
    		List<String> collection = Arrays.stream(line.split(" ")).filter(it->!it.isEmpty())
    				.collect(Collectors.toList());
             int result = Integer.valueOf(collection.get(0));
             for(int i = 1 ; i < collection.size(); i ++){
            	 String operation = collection.get(i);
            	 int operand = Integer.valueOf(collection.get(i+1));
            	 if(operation.equals("+")){
            		 result=+operand;
            	 }
            	 if(operation.equals("-")){
            		 result=-operand;
            	 }
            	 if(operation.equals("/")){
            		 result*=operand;
            	 }
            	 if(operation.equals("*")){
            		 result*=operand;
            	 }
             }    
            	 
             
             
    		 
    		 
    		 
    		 
    		 
    		 return String.valueOf(result);
    		 
    	 }
     }


