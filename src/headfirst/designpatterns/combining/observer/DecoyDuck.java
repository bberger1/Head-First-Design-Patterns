package headfirst.designpatterns.combining.observer;

/**
 * the decoyDuck has obviously no output, except silence 
 * implements Quackable, to define a specific output
 * @author Benedikt
 */
public class DecoyDuck implements Quackable {
	Observable observable;

	/**
	 * decoyDuck constructor
	 */
	public DecoyDuck() {
		observable = new Observable(this);
	}
 
	/**
	 * obviously, the decoyDuck can not quark, so silent will be the output
	 */
	public void quack() {
		System.out.println("<< Silence >>");
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
	 * the description for the decoy Duck will be returned
	 */
	public String toString() {
		return "Decoy Duck";
	}
}
