import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Outer {
	public Integer a;
	
	public Outer() {
		
	}
	@JsonUnwrapped
	public  Inner inner;
	public void setInner(Inner inner) {
		this.inner = inner;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getA() {
		return a;
	}

	public Inner getInner() {
		return inner;
	}

	
	

}
