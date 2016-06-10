package headfirst.designpatterns.combining.observer;

/**
 * CountingDuckFactory 
 * enables the counting of quacks for the given ducks
 * design pattern: concrete factory
 * @author Benedikt
 */
public class CountingDuckFactory extends AbstractDuckFactory {
  
	/**
	 * creates a new mallardDuck by calling the quackCounter constructor (to enable quack counting)
	 * and the mallardDuck, which is needed by the constructor of quackCounter
	 */
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
  
	/**
	 * creates a new redheadDuck by calling the quackCounter constructor (to enable quack counting)
	 * and the redheadDuck, which is needed by the constructor of quackCounter
	 */
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}
  
	/**
	 * creates a new duckCall by calling the quackCounter constructor (to enable quack counting)
	 * and the duckCall, which is needed by the constructor of quackCounter
	 */
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
   
	/**
	 * creates a new rubberDuck by calling the quackCounter constructor (to enable quack counting)
	 * and the rubberDuck, which is needed by the constructor of quackCounter
	 */
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
