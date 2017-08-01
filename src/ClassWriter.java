import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClassWriter {

	public static File file = new File("C:/Users/Михаил/OneDrive/workspace/JacksonHomeWork/ert.json");

	public static void main(String[] args)
			throws JsonGenerationException, JsonMappingException, IOException, Exception, IllegalAccessException {
		List<Integer> asList = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {
			asList.add(i);
		}
		List<Integer> asListt = null;

		Outer outer = new Outer();
		Inner inner = new Inner();
		inner.setB("j");
		inner.setList(asList);
		outer.setA(null);
		outer.setInner(inner);

		ObjectMapper mapper = new ObjectMapper();

		mapper.writeValue(file, outer);

	}

}
