
public class Add implements Runnable {

	private BlockingQueuelmpl c;



	//private final int  size = 10;
	//BlockingQueuelmpl e = new BlockingQueuelmpl(size);
   

	public Add(BlockingQueuelmpl c) {
              
		this.c=c;
	}
	
	
	
	@Override
	public void run() {
		for(int i = 0; true; i++){
			try {
				c.add(i);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}





	
	
	
	
	
}
