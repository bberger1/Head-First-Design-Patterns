package headfirst.designpatterns.combining.observer;

/**
 * the rubberDuck implements Quackable, to define a specific output 
 * @author Benedikt
 */
public class RubberDuck implements Quackable {
	Observable observable;

	/**
	 * rubberDuck constructor
	 */
	public RubberDuck() {
		observable = new Observable(this);
	}
 
	/**
	 * the "quark" of the rubberDuck is "Squeak"
	 */
	public void quack() {
		System.out.println("Squeak");
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
	 * the description for the rubberDuck will be returned
	 */
	public String toString() {
		return "Rubber Duck";
	}
}
