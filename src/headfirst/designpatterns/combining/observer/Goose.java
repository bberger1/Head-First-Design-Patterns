package headfirst.designpatterns.combining.observer;

/**
 * the goose prevents to be a duck, which works, thanks to gooseAdapter
 * design pattern: adapter/proxy pattern
 * @author Benedikt
 */
public class Goose {

	/**
	 * instead of quacking, the goose honks
	 */
	public void honk() {
		System.out.println("Honk");
	}

	/**
	 * the description for the goose will be returned
	 */
	public String toString() {
		return "Goose";
	}
}
