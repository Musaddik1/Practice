package FactorPattern;

public abstract class Computer {

	public abstract String getRAM();
	public abstract String getROM();
	public abstract String getCPU();
	
	
	@Override
	public String toString() {
		return "Computer [getRAM()=" + getRAM() + ", getROM()=" + getROM() + ", getCPU()=" + getCPU() + "]";
	}
	
	
	
}
class PC extends Computer
{
	private String RAM;
	private String ROM;
	private String CPU;
	public PC()
	{
		
	}
	public PC(String rAM, String rOM, String cPU) {
		super();
		RAM = rAM;
		ROM = rOM;
		CPU = cPU;
	}
	public String getRAM()
	{
		return RAM;
	}
	public String getROM() 
	{
		return ROM;
	}
	public String getCPU() 
	{
		return CPU;
	}
	@Override
	public String toString() {
		return "PC [RAM=" + RAM + ", ROM=" + ROM + ", CPU=" + CPU + "]";
	}
	
	
}
 class Server extends Computer
 {
	 private String RAM;
	 private String ROM;
	 private String CPU;
	 public Server()
	 {
		 
	 }
	 
	public Server(String rAM, String rOM, String cPU) {
		super();
		RAM = rAM;
		ROM = rOM;
		CPU = cPU;
	}

	public String getRAM() {
		return RAM;
	}
	public String getROM() {
		return ROM;
	}
	public String getCPU() {
		return CPU;
	}

	@Override
	public String toString() {
		return "Server [RAM=" + RAM + ", ROM=" + ROM + ", CPU=" + CPU + "]";
	}
	 
 }
