import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	Car car;
	private static final int HUNDRED = 100;
	
	@Before
	public void setUp() throws Exception{
		car = new Car(HUNDRED);
	}
	
	@Test
	public void testCar() {
		assertFalse(car.getRange() != 50);
		
		assertTrue(car.getRange() == 100);
	}

	@Test
	public void testEqualsCar() {
		Car x = new Car(50);
		assertFalse(car.equals(x));
		
		Car y = new Car(100);
		assertTrue(car.equals(y));
	}

	@Test
	public void testEqualsObject() {
		Object x = new Car(HUNDRED);
		boolean expected = true;
		boolean actual = car.equals(x);
		assertEquals(expected, actual);
		
		String y = new String("Bogus car");
		assertEquals(false, car.equals(y));
		assertFalse(car.equals(y));
	}

	@Test
	public void testToString() {
		//Stick to stringent government requirements about 
		//a product information
		String expected = "This vehicle has a range of 100 miles";
		String actual = car.toString();
		assertEquals(expected, actual);
		
		Car evCar = new Car(70);
		expected = "This vehicle has a range of 70 miles";
		actual = evCar.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMilesToGo() {
		int milesDriven = 10;
		int expected = 90;
		int actual = car.milesToGo(milesDriven);
		assertEquals(expected, actual);
		
	
	}

}
