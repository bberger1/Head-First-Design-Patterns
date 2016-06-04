package headfirst.designpatterns.combining.observer;

/**
 * creates the necessary ducks by calling the constructors and returning duck objects
 * @author Benedikt
 */
public class DuckFactory extends AbstractDuckFactory {
  
	/**
	 * creates a new mallardDuck by calling the constructor of mallardDuck
	 */
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}
  
	/**
	 * creates a new redheadDuck by calling the constructor of redheadDuck
	 */
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}
  
	/**
	 * creates a new duckCall by calling the constructor of duckCall
	 */
	public Quackable createDuckCall() {
		return new DuckCall();
	}
   
	/**
	 * creates a new rubberDuck by calling the constructor of rubberDuck
	 */
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
