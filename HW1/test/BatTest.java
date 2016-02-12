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


public class BatTest {

	public BatTest()
	{
		
	}
	
	//ByteArrayOutputStream is used to capture the output from System.out
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	Bat testBat;
	
	
	@Before
	public void setUpStreams()
	{
		System.setOut(new PrintStream(outContent));
		testBat = new Bat("Bill");
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
		Bat inst = new Bat("Bill");
		String exp = "Bill Bat";
		String res = inst.toString();
		assertEquals(exp,res);
	}
	
	//Test of the Bat class move method
	@Test
	public void testMove()
	{
		System.out.println("test: move");
		testBat.move();
		assertTrue(outContent.toString().contains("Bill Bat is swooping through the dark."));
		
	}
	
	//Test of the Creature class eat method
	@Test
	public void testCanEat() throws Exception
	{
		testBat.eat(new Ant("food"));
		assertTrue(outContent.toString().contains("Bill Bat has eaten a food Ant."));
	}
	

	
	 @Test
	 public void testFly() throws Exception 
	 {
		 testBat.fly();
		 assertTrue(outContent.toString().contains("Bill Bat is swooping through the dark."));
	 }
	
	@Test 
	public void testCantEat() throws Exception
	{
		//System.out.println("test: eat");
	
		testBat.eat(new Thing("Junk"));
		assertTrue(outContent.toString().contains("Bill Bat won't eat a Junk Thing."));
	}
	
	@Test
	public void testWhatDidYouEat1() throws Exception
	{
		testBat.whatDidYouEat();
		assertTrue(outContent.toString().contains("Bill Bat has had nothing to eat!"));
	}
	
	@Test
	public void testWhatDidYouEat2() throws Exception
	{
		testBat.eat(new Ant("ant_food"));
		testBat.whatDidYouEat();
		assertTrue(outContent.toString().contains("Bill Bat has eaten a ant_food Ant"));
	}
	 
}
