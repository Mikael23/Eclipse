import java.util.List;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonFormat()
public class Inner {
	
	
	public  String b;
	public  List<Integer> list;
	public void setB(String b) {
		this.b = b;
	}

	public Inner() {
		super();
	}

	public String getB() {
		return b;
	}

	public List<Integer> getList() {
		return list;
	}


	
	public void setList(List<Integer> list) {
		this.list = list;
	}

	
	}
	

