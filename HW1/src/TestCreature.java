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
		
		thingArray[THING_COUNT-1] = new Tiger("Tony");
		thingArray[THING_COUNT-2] = new Tiger("Timmy");
		thingArray[THING_COUNT-3] = new Tiger("Tommy");
		
		System.out.println("Things:\n");
		for(int j=0;j<THING_COUNT;j++)
		{
			System.out.println(thingArray[j]);
		}
		
		//Part2
		Creature[] creatureArray = new Creature[CREATURE_COUNT];
		creatureArray[0] = new Bat("Bruce");
		creatureArray[1] = new Fly("Fred");
		creatureArray[2] = new Ant("Andy");
		
		System.out.println("\nCreatures:\n");
		for(int k = 0; k<CREATURE_COUNT; k++)
		{
			System.out.println(creatureArray[k]);
		}
		
	}
	
	
}
