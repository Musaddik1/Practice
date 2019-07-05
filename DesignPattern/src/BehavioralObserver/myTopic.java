package BehavioralObserver;

import java.util.ArrayList;

import Singleton.synchronize;

public class myTopic implements Subject {

	private String message;
	private ArrayList<Observer> observer;
	private boolean changed;
	
	
	public myTopic()
	{
		this.observer=new ArrayList<Observer>();
	}
	public void register(Observer obj)
	{
		if(obj==null)
		{
			System.out.println("Observer null");
			
		}
		synchronized(myTopic.this)
		{
			if(!observer.contains(obj)) 
			{
				observer.add(obj);
			}
		}
	}
	@Override
	public void Unregister(Observer obj) {
		
		synchronized(myTopic.this)
		{
			observer.remove(obj);
			
		}
	}
	@Override
	public Object getUpdate(Observer obj) {
		
		return this.message;
	}
	@Override
	public void notifyObserver()
	{
		ArrayList<Observer> observerlocal=null;
		
		synchronized(myTopic.this)
		{
			if(!changed)
				return;
			observerlocal=new ArrayList<Observer>();
			changed=false;
		}
		for(Observer obj:observerlocal)
		{
			obj.update();
		}
	}
	public void postMessage(String msg){
		System.out.println("Message Posted to Topic:"+msg);
		this.message=msg;
		this.changed=true;
		notifyObserver();
	}
}
