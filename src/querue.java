import java.util.LinkedList;
import java.util.Queue;

import org.omg.Messaging.SyncScopeHelper;

public class querue implements Runnable {

	public  static Queue<Integer> queue = new LinkedList<>();

	public int random() {

		int random = (int) (Math.random() * 50 + 1);

		return random;

	}

	
public static void main(String[] args) throws InterruptedException {
	querue r = new querue();
	
	Thread threadd = new Thread((Runnable)()->{
			
			
			try{Thread.sleep(1000);
			System.out.println("Size:" + queue.size());
			
			}
			catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
	

	});
	    threadd.start();
		
	for (int i = 0; i < 5; i++) {
	Thread Mythread = new Thread((Runnable)()->{
		
			
			 queue.add(r.random());
	    	 
	     });
		
		
	    Mythread.start();
	    Mythread.join();
	       
		
	
	
	
	
	
	for(int q = 0 ; q < 5; q ++ ){
		Thread MynewThread = new Thread((Runnable)()->{
		System.out.println(queue.element());
		
		});
		
		MynewThread.start();
	}
	
	
			
	 
	}
	}


@Override
public void run() {
	// TODO Auto-generated method stub
	
}
}
