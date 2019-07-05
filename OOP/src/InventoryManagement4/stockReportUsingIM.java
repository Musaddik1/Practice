package InventoryManagement4;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class stockReportUsingIM {
	
	public static void main(String[] args) {
		stock stock1[];
		double price=0;
		int numberOfshare=0;
		ObjectMapper mapper=new ObjectMapper();
		File file=new File("/home/admin123/eclipse-workspace"
				+ "/OOP/src/InventoryManagement4"
				+ "/StockReport.json");
		try 
		{
			JsonNode node=mapper.readTree(file);
			JsonNode node1=null;
			
			System.out.println("*******************Idea************");
			node1=node.get("first");
			stock1=mapper.readValue(node1, stock[].class);
			for(stock stock2:stock1)
			{
			System.out.println(stock2);
			price=price+stock2.getPrice();
			numberOfshare+=stock2.getNumber();
			}
			System.out.println("");
			System.out.println("****************vodafone*********************");
			
			node1=node.get("second");
			stock1=mapper.readValue(node1, stock[].class);
			for(stock stock2:stock1)
			{
				System.out.println(stock2);
				price=price+stock2.getPrice();
				numberOfshare+=stock2.getNumber();
			}
			System.out.println("****************JIO*********************");
			node1=node.get("third");
			stock1=mapper.readValue(node1, stock[].class);
			for(stock stock2:stock1)
			{
				System.out.println(stock2);
				price=price+stock2.getPrice();
				numberOfshare+=stock2.getNumber();
			}
			System.out.println("****************Airtel*********************");
			node1=node.get("fourth");
			stock1=mapper.readValue(node1, stock[].class);
			for(stock stock2:stock1)
			{
				System.out.println(stock2);
				price=price+stock2.getPrice();
				numberOfshare+=stock2.getNumber();
			}
			System.out.println("Total Price :"+price);
			System.out.println("Total number of share :"+numberOfshare);
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
		
	}

}
