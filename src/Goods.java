import java.io.Serializable;

public class Goods implements Serializable {

	public Goods(int id) {
		int m_id = id;
	}

	@Override
	public String toString() {
		String result = String.format("Employee[id=%d, name=%s,  amount=%d]", id, name, amount);

		return result;
	}

	public int id;
	public String name;
	public int amount;

	public boolean getAvailable() {

		return available;

	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public transient boolean available;

}
