package StockReport;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class TestStock {
	
	
	public static void main(String[] args) throws IOException 
	{
		File file=new File("/home/admin123/eclipse-workspace/OOP/src/StockReport/stock.txt");
		UtilStock util=new UtilStock();
		Stock stock=new Stock();
		stock=util.getReport(file);
		
	}

}
