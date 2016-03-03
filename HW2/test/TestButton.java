/**
 * @author Scott Rigg
 */

import java.io.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import button.Button;
import lightbulb.Lightbulb;
import lightbulb.LightbulbInt;


public class TestButton {

	
	
	//private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	LightbulbInt l = new Lightbulb();
	Button testButton = new Button(l);
	/*@Before
	public void setUpStreams()
	{
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void cleanUpStreams()
	{
		System.setOut(null);
	}*/
	
	/*@Test
	public void testSwitchOn()
	{
		Lightbulb lb = new Lightbulb();
		Button b = new Button(lb);
		b.switchOn();
		assertEquals("Button switched to ON\nLightbulb on\n",outContent.toString());
		
	}*/
	
	@Test
	public void testSwitchOn() 
	{
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		testButton.switchOn();
		assertEquals("Button switched to ON\nLightbulb on\n",outContent.toString());

	}
	
}
