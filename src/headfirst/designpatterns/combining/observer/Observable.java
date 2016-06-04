package headfirst.designpatterns.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;

/**
 * @author Benedikt
 */
public class Observable implements QuackObservable {
	// saves all observers in this arrayList to easily call a specific method
	// with a simple while loop
	ArrayList<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;
 
	/**
	 * Observable constructor
	 * @param duck	duck object of the type quackObservable	
	 */
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
  
	/**
	 * adds new observers by adding it to the arrayList "observers"
	 */
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
  
	/**
	 * with a simple while-loop, the update method of every single observer in the arrayList will be called
	 */
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}
 
	/**
	 * returns the iterator of the arrayList "observers"
	 * @return		iterator of the arrayList "observers"
	 */
	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
}
