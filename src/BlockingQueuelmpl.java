import java.util.LinkedList;
import java.util.Queue;




public class BlockingQueuelmpl implements BlockingQueue {
   Queue<Integer>queue = new LinkedList<>();
  private int capacity;


   BlockingQueuelmpl(int capacity){
	   this.capacity = capacity;
	   
   }
          
   
   
	@Override
	public synchronized void add(Integer e) throws Exception {
		
		while(queue.size()==capacity){
			try{
		
			wait();
			
		}
			catch(InterruptedException u){
				//nothing
			}
		}
		queue.add(e);
		System.out.println(queue);
		//notifyAll();
	}

	@Override
	public
	synchronized Integer poll() throws Exception {
		while(queue.size()==0){
			System.out.println("Stop");
			wait();
		}
		System.out.println(queue.poll());
		notifyAll();
		
		return 1;
	}



	

}
