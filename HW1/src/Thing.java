/**
 * 
 * @author Scott Rigg 
 * 2/9/16
 *
 */
public class Thing {
	String name;
	
	public Thing(String name)
	{
		this.name=name;
	}
	
	@Override
	public String toString()
	{
		String cName = getClass().getSimpleName();
		return this.name + " " + cName;
	}
	
}
