package DateOfTransaction;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

public class dateoftransactionTest {
	
	
	public static void main(String[] args) throws JsonProcessingException, IOException {
		Transaction transaction[];
		QueueDate<String> datelist=new QueueDate<String>();
		ObjectMapper mapper=new ObjectMapper();
		String pathname="/home/admin123/eclipse-workspace/OOP"
				+ "/src/DateOfTransaction/data.json";
		File file=new File(pathname);
		JsonNode node=null;
		JsonNode node1=null;
		node=mapper.readTree(file);
		String string[]= {"first","second","third","fourth"};
		for(int i=0;i<string.length;i++)
		{
			node1=node.get(string[i]);
			transaction=mapper.readValue(node1, Transaction[].class);
			for(Transaction transaction1:transaction)
			{
				String date=transaction1.getDate();
				datelist.Enqueue(date);
			}
			
		}
		datelist.display();
		
	}

}
