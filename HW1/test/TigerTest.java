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


public class TigerTest {

	public TigerTest()
	{
		
	}
	
	//ByteArrayOutputStream is used to capture the output from System.out
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	Tiger testTiger;
	
	
	@Before
	public void setUpStreams()
	{
		System.setOut(new PrintStream(outContent));
		testTiger = new Tiger("Tony");
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
		Tiger inst = new Tiger("Bill");
		String exp = "Bill Tiger";
		String res = inst.toString();
		assertEquals(exp,res);
	}
	
	//Test of the Bat class move method
	@Test
	public void testMove()
	{
		System.out.println("test: move");
		testTiger.move();
		assertTrue(outContent.toString().contains("Tony Tiger has just pounced."));
		
	}
	
	//Test of the Creature class eat method
	@Test
	public void testCanEat() throws Exception
	{
		testTiger.eat(new Ant("food"));
		assertTrue(outContent.toString().contains("Tony Tiger has eaten a food Ant."));
	}
	
	
	@Test
	public void testWhatDidYouEat1() throws Exception
	{
		testTiger.whatDidYouEat();
		assertTrue(outContent.toString().contains("Tony Tiger has had nothing to eat!"));
	}
	
	@Test
	public void testWhatDidYouEat2() throws Exception
	{
		testTiger.eat(new Ant("ant_food"));
		testTiger.whatDidYouEat();
		assertTrue(outContent.toString().contains("Tony Tiger has eaten a ant_food Ant"));
	}
	 
}
