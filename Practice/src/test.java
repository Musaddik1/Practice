import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

public class test {
	
	public static void main(String[] args) throws JsonProcessingException, IOException {
		ObjectMapper mapper=new ObjectMapper();
		File file=new File("/home/admin123/eclipse-workspace/Practice/test.json");
		JsonNode node=mapper.readTree(file);
		JsonNode node1=node.get("myJSON");
		
		
	}

}
