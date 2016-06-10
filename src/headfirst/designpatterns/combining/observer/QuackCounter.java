package headfirst.designpatterns.combining.observer;

/**
 * the quackCounter stays in track to count ducks, which quacked also prevents
 * method to get a specific duck identified by a number
 * design pattern: observer pattern
 * 
 * @author Benedikt
 *
 */
public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;

	/**
	 * the constructor needs a duck as a parameter to save it
	 * 
	 * @param duck
	 *            duck object is needed to execute the methods of this class
	 */
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}

	/**
	 * the quack method of a specific duck (attribute) will be executed and the
	 * counter will be raised by 1
	 */
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}

	/**
	 * returns the number of quacks
	 * 
	 * @return number of quacks
	 */
	public static int getQuacks() {
		return numberOfQuacks;
	}

	/**
	 * a new observer, hand over as a parameter, will be added to the other
	 * observers
	 */
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}

	/**
	 * every observer will be notified
	 */
	public void notifyObservers() {
		duck.notifyObservers();
	}

	/**
	 * the description for the specific duck will be returned
	 */
	public String toString() {
		return duck.toString();
	}
}
