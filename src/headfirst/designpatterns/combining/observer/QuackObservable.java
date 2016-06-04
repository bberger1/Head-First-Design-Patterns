package headfirst.designpatterns.combining.observer;

/**
 * defines the necessary methods
 * @author Benedikt
 */
public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
