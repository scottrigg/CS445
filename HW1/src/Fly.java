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
	public String eat(Thing thing)
	{
		String m;
		String cName = thing.getClass().getSimpleName();
		if(!(cName.equals("Thing")) )
		{
			m = toString() + " won't eat a " + thing.getClass().getSimpleName() + ".";
		}
		else
		{
			m = super.eat(thing);
		}
		return m;
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
