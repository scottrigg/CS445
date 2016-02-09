/**
 * 
 * @author Scott Rigg
 * 2/9/16
 *
 */
public class Tiger extends Creature
{

	public Tiger(String name)
	{
		super(name);
	}
	
	@Override 
	public void move()
	{
		System.out.println(this.toString()+ " has just pounced.");
	}
	
}
