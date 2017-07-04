
public class Poll implements Runnable {
	private final BlockingQueuelmpl poll;

	public Poll(BlockingQueuelmpl c) {
		poll = c;
	}

	
	
	@Override
	public void run() {
		while(true){
			
			try {
				
				poll.poll();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
}
