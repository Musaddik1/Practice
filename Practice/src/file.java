import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;


public class file {

	
	static stock stock1[];
	public static void main(String[] args) throws JsonProcessingException, IOException {
		
		ObjectMapper mapper=new ObjectMapper();
		File file1=new File("/home/admin123/eclipse-workspace/"
				+ "OOP/src/InventoryManagement4/StockReport.json");
		File file=new File("/home/admin123/eclipse-workspace"
				+ "/OOP/src/InventoryManagement4/write.json");
		ArrayList<stock> stock2=new ArrayList<stock>();
		JsonNode node=mapper.readTree(file1);
		JsonNode node1=null;
		String string[]= {"first","second","third","fourth"};
		for(int i=0;i<string.length;i++)
		{
			node1=node.get(string[i]);
			stock1=mapper.readValue(node1, stock[].class);
			for(stock stock3:stock1)
			{
				stock2.add(stock3);
			}
			mapper.writeValue(file, stock2);
			
		}
		
		
		
	}
}
