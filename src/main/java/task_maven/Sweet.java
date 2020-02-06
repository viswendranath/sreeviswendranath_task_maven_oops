package task_maven;

public class Sweet extends Candy {

	Sweet(String varientName, String manufacturer) {
		this.varientName = varientName;
		this.manufacturer = manufacturer;
	}

	public void whoAmI() {
		System.out.println("I am a sweet named" + varientName + " came from " + manufacturer + " company");
	}

}
