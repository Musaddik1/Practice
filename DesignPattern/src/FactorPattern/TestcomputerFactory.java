package FactorPattern;

public class TestcomputerFactory {
	
	public static void main(String[] args) {
		
		Computer pc=computerFactory.getComputer("PC", "4GB", "500GB", "2.1GHZ");
		
		Computer server=computerFactory.getComputer("Server", "5GB", "1TB", 
				"2.9GHZ");
		
		System.out.println("PC configure :"+pc);
		System.out.println("Server configure :"+server);
	}

}
