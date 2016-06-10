package headfirst.designpatterns.combining.observer;

/**
 * AbstractDuckFactory 
 * abstract class which provides the necessary methods for DuckFactories 
 * design pattern: abstract factory
 * 
 * @author Benedikt
 */
public abstract class AbstractDuckFactory {
 
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
