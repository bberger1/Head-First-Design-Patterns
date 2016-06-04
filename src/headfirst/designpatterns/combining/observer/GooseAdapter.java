package headfirst.designpatterns.combining.observer;

/**
 * the gooseAdapter provides a goose which pretends to be a duck
 * @author Benedikt
 */
public class GooseAdapter implements Quackable {
	Goose goose;
	Observable observable;

	/**
	 * gooseAdapter constructor
	 * 
	 * @param goose
	 *            the goose is needed, to call the contained methods
	 */
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}
 
	/**
	 * the quack method executes the honk method of the goose, because a goose is not quacking
	 */
	public void quack() {
		goose.honk();
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
	 * the description for the goose-duck fake will be returned
	 */
	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
