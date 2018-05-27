


import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void testDodawania() throws Exception {
		System.out.println("Metoda testowa");
		double a = 2.0;
		double b = 3.0;

		double c = 4.5;
		double d = 1.2;

		double suma1 = classUnderTest.sum(a,b);
		double suma2 = classUnderTest.sum(c,d);


		Assert.assertEquals("Bledny wynik sumowania", 5.0, suma1, 0.001);
		Assert.assertEquals("Bledny wynik sumowania", 5.0, suma2, 0.001);
	}

    @Test(expected = IllegalArgumentException.class)
    public void testDzielenia() {
        System.out.println("Metoda testowa");
        double a = 5.0;
        double b = 0.0;

        double c = 4.5;
        double d = 1.2;

        double dzielenie = classUnderTest.divide(a,b);
        double suma2 = classUnderTest.sum(c,d);

        Assert.assertEquals("Bledny wynik sumowania", 3.0, dzielenie, 0.001);
        Assert.assertEquals("Bledny wynik sumowania", 5.0, suma2, 0.001);
    }
}
