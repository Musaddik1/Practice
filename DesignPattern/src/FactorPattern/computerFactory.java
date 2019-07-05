package FactorPattern;


public class computerFactory {
	
	public static Computer getComputer(String type,String ram,String rom,String cpu)
	{
		if("PC".equalsIgnoreCase(type))
		{
			return new PC(ram, rom, cpu);
		}
		else if("Server".equalsIgnoreCase(type))
		{
			return new Server(ram,rom,cpu);
		}
		return null;
	}

}
