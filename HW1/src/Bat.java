/**
 * 
 * @author Scott Rigg
 * 2/11/16
 *
 */
public class Bat extends Creature implements Flyer{
	public Bat(String n)
	{
		super(n);
	}

	@Override
	public void eat(Thing thing)
	{
		String cName = thing.getClass().getSimpleName();
		if(!(cName.equals("Thing")) )
		{
			super.eat(thing);
		}
		else
		{
			System.out.println(this.toString()+ " won't eat a " + thing.toString() + ".");
		}
	}
	
	@Override
	public void move()
	{
		this.fly();
	}
	
	@Override
	public void fly()
	{
		System.out.println(this.toString() + " is swooping through the dark.");
	}
	
}
