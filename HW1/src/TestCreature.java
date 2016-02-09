/**
 * 
 * @author Scott Rigg on 2/9/16
 *
 */
public class TestCreature {

	public static final int THING_COUNT = 10;
	public static final int CREATURE_COUNT = 3;
	
	public static void main(String[] args)
	{
		
		Thing[] thingArray = new Thing[THING_COUNT];
		for(int i =0; i<THING_COUNT-3;i++)
		{
			thingArray[i] = new Thing("Scott"+i);
		}
		
		thingArray[0] = new Tiger("Tony");
		thingArray[1] = new Tiger("Timmy");
		thingArray[2] = new Tiger("Tommy");
		
		System.out.println("Things:\n");
		for(int j=0;j<THING_COUNT;j++)
		{
			System.out.println(thingArray[j]);
		}
		
	}
	
	
}
