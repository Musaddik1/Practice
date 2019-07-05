package StructuralPattern;

public class commandExecutorimpl implements commandExecutor {

	@Override
	public void runCommand(String cmd) {
		
		try 
		{
			Runtime.getRuntime().exec(cmd);
			System.out.println(" "+cmd+ "command executed :");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
