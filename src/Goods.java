import java.io.Serializable;

public class Goods implements Serializable {

	public Goods(int id) {
		int m_id = id;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		 String result = String.format(
	                "Employee[id=%d, name=%s,  amount=%d]",
	                id, name,  amount);

	        return result;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int id;
	public String name;
	public int amount;
	
	public int getAvailable() {
		if(available>0){
		return available;
		}
		else return 0;
	}
	public void setAvailable(int available) {
		this.available = available;
	}

	public transient int  available;
	
	
	
}
