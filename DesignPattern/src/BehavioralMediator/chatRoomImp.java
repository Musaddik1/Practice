package BehavioralMediator;

public class chatRoomImp implements ChatRoom {

	@Override
	public void showMsg(String msg, Participant p) {
		
		System.out.println("Name  "+p.getName()+"\nMessage  :"+msg+"\n");
		
	}

}
