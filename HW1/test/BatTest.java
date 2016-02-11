/**
 * 
 * @author Scott Rigg
 * 2/10/16
 *
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class BatTest {

	public BatTest()
	{
		
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
		Bat inst = new Bat("Bill");
		//inst.move();
		String exp = "Bill Bat is swooping through the dark.";
		//String res = inst.move();
		assertEquals(exp,inst.toString());
		
	}
	
	//Test of the Creature class eat method
	@Test
	public void testEat()
	{
		System.out.println("test: eat");
		Ant food = new Ant("Anthony");
		Bat inst = new Bat("Bill");
		inst.eat(food);
		String exp = "Bill Bat has just eaten a Ant.";
		//String res = inst.eat(food);
		assertEquals(exp,inst.toString());
	}
	
	
}
