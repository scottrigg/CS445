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


public class AntTest {

	public AntTest()
	{
		
	}
	
	//ByteArrayOutputStream is used to capture the output from System.out
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	Ant testAnt;
	
	
	@Before
	public void setUpStreams()
	{
		System.setOut(new PrintStream(outContent));
		testAnt = new Ant("Andy");
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
		Ant inst = new Ant("ant");
		String exp = "ant Ant";
		String res = inst.toString();
		assertEquals(exp,res);
	}
	
	//Test of the Ant class move method
	@Test
	public void testMove()
	{
		System.out.println("test: move");
		testAnt.move();
		assertTrue(outContent.toString().contains("Andy Ant is crawling around."));
		
	}
	
	//Test of the Creature class eat method
	@Test
	public void testCanEat() throws Exception
	{
		testAnt.eat(new Ant("food"));
		assertTrue(outContent.toString().contains("Andy Ant has eaten a food Ant."));
	}
	
	@Test
	public void testWhatDidYouEat1() throws Exception
	{
		testAnt.whatDidYouEat();
		assertTrue(outContent.toString().contains("Andy Ant has had nothing to eat!"));
	}
	
	@Test
	public void testWhatDidYouEat2() throws Exception
	{
		testAnt.eat(new Ant("ant_food"));
		testAnt.whatDidYouEat();
		assertTrue(outContent.toString().contains("Andy Ant has eaten a ant_food Ant"));
		}
		 
	}

