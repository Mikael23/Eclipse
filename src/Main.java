
public class Main {

	public static void main(String[] args) throws Exception{
		
		BlockingQueuelmpl e =  new BlockingQueuelmpl(10);
		Runnable r = new Poll(e);
	    for(int t = 0 ; t <= 10; t++){
		
	    	Thread MyThread = new Thread(r);
	    	MyThread.setDaemon(true);
	    	MyThread.start();
	    	
	    	
	    	
		
	    }
		
		
		for(int i = 0; i< 10; i ++){
			
			
		new Add(e).run();
		                         	}
		
		
	}
	
		}
	
	
	
