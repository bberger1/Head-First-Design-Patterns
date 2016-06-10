package headfirst.designpatterns.combining.observer;

import java.util.Iterator;
import java.util.ArrayList;

/**
 * a flock is a group of ducks 
 * design pattern: observer pattern
 * @author Benedikt
 */
public class Flock implements Quackable {
	ArrayList<Quackable> ducks = new ArrayList<Quackable>();
  
	/**
	 * new ducks will be added
	 * @param duck		the new duck is hand over by a parameter
	 */
	public void add(Quackable duck) {
		ducks.add(duck);
	}
  
	/**
	 * the output from all the ducks, which are in the ducks arrayList, will be executed
	 */
	public void quack() {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.quack();
		}
	}
   
	/**
	 * a new observer, hand over as a parameter, will be added to the other observers
	 */
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}
  
	/**
	 * notifyObservers is not needed
	 */
	public void notifyObservers() { }
  
	/**
	 * the description for the flock will be returned
	 */
	public String toString() {
		return "Flock of Ducks";
	}
}
