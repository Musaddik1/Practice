package BehavioralMediator;

public  abstract class Participant {
	
	public abstract String getName();
	public abstract void setName(String name );
	public abstract void sendMsg(String msg);

}
class User1 extends Participant
{
	ChatRoom chat;
	String name;
	
	public User1(ChatRoom chat)
	{
		this.chat=chat;
	}
	@Override
	public String getName() {
	return name;
	}
	@Override
	public void setName(String name) {
		this.name=name;
		
	}
	@Override
	public void sendMsg(String msg) {
	
		chat.showMsg(msg,this);
	}
	
}
class User2 extends Participant
{
	ChatRoom chat;
	String name;
	public User2(ChatRoom chat)
	{
		this.chat=chat;
	}
	@Override
	public String getName() {
	
		return name;
	}
	@Override
	public void setName(String name) {
		this.name=name;
		
	}
	@Override
	public void sendMsg(String msg) {
		// TODO Auto-generated method stub
		chat.showMsg(msg, this);
	}
	
}