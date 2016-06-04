package headfirst.designpatterns.combining.observer;

/**
 * the quackologist detects a duck quarking and out prints the duck which quacked
 * @author Benedikt
 */
public class Quackologist implements Observer {
 
	/**
	 * update prints the duck who quacked in the console
	 */
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}
 
	/**
	 * the description for the quackologist will be returned
	 */
	public String toString() {
		return "Quackologist";
	}
}
