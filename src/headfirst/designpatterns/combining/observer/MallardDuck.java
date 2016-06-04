package headfirst.designpatterns.combining.observer;

/**
 * the mallardDuck implements Quackable, to define a specific output 
 * @author Benedikt
 */
public class MallardDuck implements Quackable {
	Observable observable;
 
	/**
	 * mallardDuck constructor
	 */
	public MallardDuck() {
		observable = new Observable(this);
	}
 
	/**
	 * the "quark" of the mallardDuck is "Quack"
	 */
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}
 
	/**
	 * a new observer, hand over as a parameter, will be added to the other observers
	 */
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
 
	/**
	 * every observer will be notified
	 */
	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	/**
	 * the description for the mallardDuck will be returned
	 */
	public String toString() {
		return "Mallard Duck";
	}
}
