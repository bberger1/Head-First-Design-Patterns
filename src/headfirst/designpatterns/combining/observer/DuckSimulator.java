package headfirst.designpatterns.combining.observer;

/**
 * contains the main method and calls every quack method of all the ducks
 * 
 * @author Benedikt
 */
public class DuckSimulator {

	/**
	 * the main method creates the factory and simulator
	 * 
	 * @param args
	 *            main method parameter
	 */
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();

		simulator.simulate(duckFactory);
	}

	/**
	 * simulates all the ducks and executes all quack methods by calling the
	 * simulate method
	 * 
	 * @param duckFactory
	 *            duckFactory needed to create the specific ducks
	 */
	void simulate(AbstractDuckFactory duckFactory) {

		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

		Flock flockOfDucks = new Flock();

		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);

		Flock flockOfMallards = new Flock();

		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();

		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);

		flockOfDucks.add(flockOfMallards);

		System.out.println("\nDuck Simulator: With Observer");

		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);

		simulate(flockOfDucks);

		System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
	}

	/**
	 * executes the quack method of a specific duck
	 * 
	 * @param duck
	 *            duck objects is needed to call the contained method
	 */
	void simulate(Quackable duck) {
		duck.quack();
	}
}
