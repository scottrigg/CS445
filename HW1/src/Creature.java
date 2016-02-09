/**
 * 
 * @author Scott Rigg
 * 2/9/16
 *
 */
public abstract class Creature extends Thing
{
	Thing ateLast;
	public Creature (String name)
	{
		super(name);
	}
	
	public void eat(Thing thing)
	{
		this.ateLast = thing;
		System.out.println(this.toString() + " has ate a " + thing.toString() + ".");
	}
	
	public abstract void move();
	
	public void whatDidYouEat()
	{
		if(this.ateLast==null)
		{
			System.out.println(this.toString() + " has had nothing to eat.");
		}
		else
		{
			System.out.println(this.toString() + " has eaten a " + ateLast.toString() + "!");
		}
	}
	
}
