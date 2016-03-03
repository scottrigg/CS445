/**
 * @author Scott Rigg
 */

import java.io.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import button.*;
import lightbulb.Lightbulb;
import lightbulb.LightbulbInt;


public class TestLightbulb {

	
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams()
	{
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void cleanUpStreams()
	{
		System.setOut(null);
	}
	
	//Lightbulb is on
	@Test
	public void testLightbulbOn()
	{
		Lightbulb lb = new Lightbulb();
		lb.on();
		assertEquals("Lightbulb on\n",outContent.toString());
		
	}

	//Lightbulb is off
	@Test
	public void testLightbulbOff()
	{
		Lightbulb lb = new Lightbulb();
		lb.off();
		assertEquals("Lightbulb off\n",outContent.toString());
		
	}	

	//Lightbulb is off then on then off
	@Test
	public void testLightbulbOffOnOff()
	{
		Lightbulb lb = new Lightbulb();
		lb.off();
		lb.on();
		lb.off();
		assertEquals("Lightbulb off\nLightbulb on\nLightbulb off\n",outContent.toString());
	}
	
	
}
