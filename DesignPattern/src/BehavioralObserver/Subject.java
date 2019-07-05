package BehavioralObserver;


public interface Subject {
	
	public void register(Observer obj);
	public void Unregister(Observer obj);
	public Object getUpdate(Observer obj);
	public void notifyObserver();

}
