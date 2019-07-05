package BehavioralMediator;

public class TestMediator {
	
	public static void main(String[] args) {
		
		ChatRoom chat=new chatRoomImp();
		User1 user1=new User1(chat);
		user1.setName("Musaddik");
		user1.sendMsg("hi");
	}

}
