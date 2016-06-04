package headfirst.designpatterns.combining.observer;

/**
 * the duckCall implements Quackable, to define a specific output 
 * @author Benedikt
 *
 */
public class DuckCall implements Quackable {
	Observable observable;

	/**
	 * duckCall constructor
	 */
	public DuckCall() {
		observable = new Observable(this);
	}
 
	/**
	 * the "quark" of the duckCall is "Quack"
	 */
	public void quack() {
		System.out.println("Kwak");
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
	 * the description for the duckCall will be returned
	 */
	public String toString() {
		return "Duck Call";
	}
}
