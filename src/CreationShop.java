import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class CreationShop  {
	 final static Scanner scanner = new Scanner(System.in);
	   
	 static final ReadWrite db = new ReadWrite();
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		
		
		 Shop newshop = db.read();
		 System.out.println("name of shop");
			String name = scanner.next();
		while(true){
			
			
			
			
			int menu = menu();
			if(menu==0){
				db.write(newshop);
				System.out.println(newshop);
				System.exit(0);
			}
			if(menu==1){
				System.out.println(newshop.goods.entrySet());
				
			}
			if(menu==2){
				Goods goods = readfromconsole();
				newshop.addgoods(goods);
				
			}	
			if(menu==3){
				System.out.println("Id");
				int q = scanner.nextInt();
				newshop.goods.remove(q);
			}
			if(menu==4){
				System.out.println(newshop.name);
			}
			
			
		}

	}
	private static Goods readfromconsole() {
		
		System.out.println("ID");
		int id = scanner.nextInt();
		System.out.println("name");
		String name = scanner.next();
		System.out.println("numbers");
		int numbers = scanner.nextInt();
		Goods goods = new Goods(id);
		goods.id = id;
		goods.name = name;
		goods.amount = numbers;
		return goods;
		
		
	}
	private static int menu() {
		System.out.println("0 - keep and exit");
		System.out.println("1-Show all goods");
		System.out.println("2-To add goods");
		System.out.println("3-deletion of goods");
		System.out.println("4-information about shop");
		int result = scanner.nextInt();
		return result ;
	}
   
}
