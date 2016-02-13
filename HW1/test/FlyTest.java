/**
 * 
 * @author Scott Rigg
 * 2/10/16
 *
 */
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class FlyTest {

	public FlyTest()
	{
		
	}
	
	//ByteArrayOutputStream is used to capture the output from System.out
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	Fly testFly;
	
	
	@Before
	public void setUpStreams()
	{
		System.setOut(new PrintStream(outContent));
		testFly = new Fly("Fred");
	}
	
	@After
	public void cleanUpStreams()
	{
		System.setOut(null);
	}
	
	//Test of the toString method for the Thing class
	@Test
	public void testToString()
	{
		System.out.println("test: toString");
		Fly inst = new Fly("Bill");
		String exp = "Bill Fly";
		String res = inst.toString();
		assertEquals(exp,res);
	}
	
	//Test of the Bat class move method
	@Test
	public void testMove()
	{
		System.out.println("test: move");
		testFly.move();
		assertTrue(outContent.toString().contains("Fred Fly is buzzing around in flight."));
		
	}
	
	//Test of the Creature class eat method
	@Test
	public void testCanEat() throws Exception
	{
		testFly.eat(new Thing("food"));
		assertTrue(outContent.toString().contains("Fred Fly has eaten a food Thing."));
	}
	
	
	@Test
	public void testWhatDidYouEat1() throws Exception
	{
		testFly.whatDidYouEat();
		assertTrue(outContent.toString().contains("Fred Fly has had nothing to eat!"));
	}
	
	@Test
	public void testCantEat() throws Exception
	{
		testFly.eat(new Ant("Food"));
		assertTrue(outContent.toString().contains("Fred Fly won't eat a Food Ant"));
	}
	
	@Test
	public void testWhatDidYouEat2() throws Exception
	{
		testFly.eat(new Thing("food"));
		testFly.whatDidYouEat();
		assertTrue(outContent.toString().contains("Fred Fly has eaten a food Thing"));
	}
	 
}
