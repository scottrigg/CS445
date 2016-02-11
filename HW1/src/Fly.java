/**
 * 
 * @author Scott Rigg
 * 2/10/16
 *
 */
public class Fly extends Creature implements Flyer{
	
	public Fly(String n)
	{
		super(n);
	}

	@Override
	public void eat(Thing thing)
	{
		
		String cName = thing.getClass().getSimpleName();
		if(!(cName.equals("Thing")) )
		{
			System.out.println(this.toString()+ " won't eat a " + thing.toString() + ".");
		}
		else
		{
			super.eat(thing);
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
		System.out.println(this.toString() + " is buzzing around in flight.");
	}
	
}
