
public class LetterPrintersChain implements Runnable {
   public final char letter;
	LetterPrintersChain printersChain;
	//Thread thread;
	public LetterPrintersChain(char letter, LetterPrintersChain printersChain) {
		super();
		this.letter = letter;
		this.printersChain = printersChain;
		//Runnable target = new LetterPrintersChain(letter, printersChain);
		
		 new Thread(printersChain).start();
		
		 print();
		
	}
	
      
	 
	
	 
	




	public static void main(String[] args) {
		 LetterPrintersChain printerschain = null;
		 
		 for(char c = 'z'; c>='a';c--){
			 printerschain = new LetterPrintersChain(c,printerschain);
			 
		 }
		 printerschain.print();
	}
	   
	 
	 
	 private void print() {
		 
		  Thread.interrupted();
	   
	}





	@Override
	public void run() {
		   
			try {
				
				Thread.sleep(10000);
				
			} catch (InterruptedException e) {
				System.out.println(letter);
				;
				
				
			}
		}
	}
	 

