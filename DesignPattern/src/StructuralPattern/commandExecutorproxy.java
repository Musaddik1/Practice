package StructuralPattern;

public class commandExecutorproxy implements commandExecutor{

	private boolean isadmin;
	private commandExecutor executor;
	
	public commandExecutorproxy(String user,String pwd)
	{
	if("pankaj".equals(user)&& "musaddik".equals(pwd))
	{
		isadmin=true;
	}
		executor=new commandExecutorimpl();
		
	}

	@Override
	public void runCommand(String cmd) {
		
		if(isadmin)
		{
			executor.runCommand(cmd);
		}
		else
		{
			if(cmd.trim().startsWith(" rm"))
			{
				System.out.println("not allowed for non-admin user");
			}
			else
			{
				executor.runCommand(cmd);
			}
		}
		
	}
	
}
