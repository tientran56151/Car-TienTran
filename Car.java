
public class Car {
	private int range;

	public Car(int data) {
		this.range = data;		
	}
		
	public boolean equals(Car a) {
		if (a.getClass() == this.getClass())
			System.out.println("At least it is the same class");

		System.out.println("Running this special case");
		return this.range == a.range;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Car) {
			System.out.println("They are the same instance");
			//I already know it is a Car, so I will act accordingly.
			return this.equals((Car)o);
		}
		else {
			return false;
		}
		
		///Practice :))
	}
	
	@Override
	public String toString() {
		String str = "This vehicle has a range of " + Integer.toString(range)
		+ " miles";
		return str;
	}
	
	public int milesToGo(int milesDriven) {
		return range - milesDriven;
		
	}
}
