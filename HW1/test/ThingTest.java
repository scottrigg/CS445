/**
 * @author Scott Rigg
 * 2/9/16
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThingTest 
{
	@Test
	public void testToString()throws Exception
	{
		Thing testThing = new Thing("testThing");
		assertEquals(testThing.toString(), "testThing Thing");
	}
}
