package headfirst.designpatterns.combining.observer;

/**
 * the interface Quackable provides the necessary method quack
 * @author Benedikt
 *
 */
public interface Quackable extends QuackObservable {
	public void quack();
}
