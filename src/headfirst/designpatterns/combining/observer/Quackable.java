package headfirst.designpatterns.combining.observer;

/**
 * the interface Quackable provides the necessary method quack
 * design pattern: adapter/proxy pattern
 * @author Benedikt
 *
 */
public interface Quackable extends QuackObservable {
	public void quack();
}
