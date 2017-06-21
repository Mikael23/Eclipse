import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Map.Entry;

public class ReadWrite  {
	public static final String path = "C:/Users/Михаил/OneDrive/workspace/text10.txt";
	
		
	
	public void write(Shop shop) throws IOException{
		FileOutputStream tr = new FileOutputStream(path);
		ObjectOutputStream out = new ObjectOutputStream(tr);
		
		
		out.writeObject(shop);
		}
		
	public Shop read() throws FileNotFoundException, IOException, ClassNotFoundException{
		
		if(!new File(path).exists()){
			return new Shop();
		}
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))){
	
			Shop shop = (Shop) in.readObject();
			
			for(Goods goods : shop.goods.values()){
				System.out.println(goods);
			}
			
		
			
			
		
		return (Shop) in.readObject();	
		
		 
		
		
	}
		

}

}
