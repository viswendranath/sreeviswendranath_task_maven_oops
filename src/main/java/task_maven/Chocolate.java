package task_maven;

public class Chocolate extends Candy {

	Chocolate(String varientName, String manufacturer) {
		this.varientName = varientName;
		this.manufacturer = manufacturer;
	}

	public void whoAmI() {
		System.out.println("I am a chocolate named " + varientName + " came from " + manufacturer + " company");
	}

}
