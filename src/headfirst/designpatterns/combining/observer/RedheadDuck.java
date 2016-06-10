package headfirst.designpatterns.combining.observer;

/**
 * the readheadDuck implements Quackable, to define a specific output 
 * design pattern: observer pattern
 * @author Benedikt
 */
public class RedheadDuck implements Quackable {
	Observable observable;

	/**
	 * readheadDuck constructor
	 */
	public RedheadDuck() {
		observable = new Observable(this);
	}

	/**
	 * the "quark" of the readheadDuck is "Quack"
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
	 * the description for the redheadDuck will be returned
	 */
	public String toString() {
		return "Redhead Duck";
	}
}
