package StructuralPattern;

public class proxyImage implements Image{

	private realImage realimage;
	private String filename;
	public proxyImage(String filename)
	{
		this.filename=filename;
		
	}
	@Override
	public void display() {
		if(realimage==null)
		{
			realimage=new realImage(filename);
		}
		realimage.display();
		
	}
	
}
