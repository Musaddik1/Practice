package StructuralPattern;

public class Testproxy {
	
	
	
	public static void main(String[] args) {
		
		commandExecutor executor=new commandExecutorproxy("musaddik", "musaddik");
		try
		{
			executor.runCommand("ls -ltr");
			executor.runCommand("rm -rf abc.pdf");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
