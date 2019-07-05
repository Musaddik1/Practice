package StructuralPattern;

public class realImage implements Image {
	
	private String filename;

	 public realImage(String filename) 
	 {
		 this.filename=filename;
		 loadfromDisk(filename);
	 }
	@Override
	public void display() 
	{
	System.out.println("displaying "+filename);
		
	}
	public void loadfromDisk(String filename)
	{
		System.out.println("Loading "+filename);
	}

}
