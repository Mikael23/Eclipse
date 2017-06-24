import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class Shop implements Serializable {

	Map<Integer, Goods> goods = new HashMap<>();

	public Goods addgoods(Goods product) {

		return goods.put(product.id, product);
	}

	@Override
	public String toString() {
		return "Shop [goods=" + goods + ", name=" + name + ", totalFund=" + totalFund + "]";
	}

	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalFund() {
		return totalFund;
	}

	public void setTotalFund(int totalFund) {
		this.totalFund = totalFund;
	}

	public int totalFund;

}
