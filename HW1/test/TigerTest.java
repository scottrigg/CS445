import org.junit.Test;
import static org.junit.Assert.*;

public class TigerTest {

	public TigerTest()
	{
		
	}
	
	@Test
	public void testToString()
	{
		System.out.println("test: toString");
		Tiger instance = new Tiger("Bob");
		String eResult = "Bob Tiger";
		String result = instance.toString();
		assertEquals(eResult, result);
	}
	
	@Test
	public void testEat()
	{
		System.out.println("test: eat");
		
	}
	
}
