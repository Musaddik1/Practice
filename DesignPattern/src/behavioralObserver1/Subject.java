package behavioralObserver1;

import java.util.ArrayList;

public class Subject {

	ArrayList<Observer> observers=new ArrayList<Observer>();
	int state;
	public int getState()
	{
		return state;
	}
	public void setState(int state)
	{
		this.state=state;
		notifyAllObserver();
	}
	public void attach(Observer observer)
	{
		observers.add(observer);
	}
	public void deattach(Observer observer)
	{
		observers.remove(observer);
	}
	public void notifyAllObserver()
	{
		for(Observer observer:observers)
		{
			observer.update();
		}
	}
	
}
