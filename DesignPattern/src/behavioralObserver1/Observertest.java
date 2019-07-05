package behavioralObserver1;

public class Observertest {
	
	public static void main(String[] args) {
		
		Subject subject=new Subject();
		Observer observer=new BinaryObserver(subject);
		new OctalObserver(subject);
		
		System.out.println("first state change :15");
		subject.setState(15);
		
		observer=new OctalObserver(subject);
		System.out.println("second state change :10");
		subject.setState(10);
		subject.deattach(observer);
	}

}
