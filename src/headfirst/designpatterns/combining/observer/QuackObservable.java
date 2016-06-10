package headfirst.designpatterns.combining.observer;

/**
 * defines the necessary methods
 * design pattern: observer pattern
 * @author Benedikt
 */
public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
