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


public class TestPushdownButton {

	
	
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
	
	//Button is pushed once
	@Test
	public void testPushButton1()
	{
		Lightbulb lb = new Lightbulb();
		PushdownButton pb = new PushdownButton(lb);
		pb.PushButton();
		assertEquals("Button toggled\nLightbulb on\n",outContent.toString());
		
	}

	//Button is pushed twice
	@Test
	public void testPushButton2()
	{
		Lightbulb lb = new Lightbulb();
		PushdownButton pb = new PushdownButton(lb);
		pb.PushButton();
		pb.PushButton();
		assertEquals("Button toggled\nLightbulb on\nButton toggled\nLightbulb off\n",outContent.toString());
		
	}

	//Button is pushed three times
	@Test
	public void testPushButton3()
	{
		Lightbulb lb = new Lightbulb();
		PushdownButton pb = new PushdownButton(lb);
		pb.PushButton();
		pb.PushButton();
		pb.PushButton();
		assertEquals("Button toggled\nLightbulb on\nButton toggled\nLightbulb off\nButton toggled\nLightbulb on\n",outContent.toString());
		
	}
	
}
