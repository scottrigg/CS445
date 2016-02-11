/**
 * 
 * @author Scott Rigg on 2/9/16
 *
 */
public class TestCreature {

	public static final int THING_COUNT = 10;
	public static final int CREATURE_COUNT = 6;
	
	public static void main(String[] args)
	{
		
		//Create an array of Creatures
		Creature[] creatureArray = new Creature[CREATURE_COUNT];
		int c = 0;
		creatureArray[c] = new Tiger("Tony");
		c++;
		creatureArray[c] = new Tiger("Timmy");
		c++;
		creatureArray[c] = new Bat("Bruce");
		c++;
		creatureArray[c] = new Bat("Ben");
		c++;
		creatureArray[c] = new Ant("Anthony");
		c++;
		creatureArray[c] = new Fly("Fred");
		
		//Create an array of Things
		Thing[] thingArray = new Thing[THING_COUNT];
		c=0;
		thingArray[c]=new Thing("water");
		c++;
		thingArray[c]=new Thing("car");
		c++;
		thingArray[c]=new Thing("toast");
		c++;
		thingArray[c]=new Thing("garbage");
		c++;
		
		//Add the Creature instance to the array of Things
		for(int m=0; m<CREATURE_COUNT;m++)
		{
			thingArray[c++]=creatureArray[m];
		}
		
		//Print a heading "Things:" 
		System.out.println("Things:");
		System.out.println();
		
		//Print the Thing and the attribute
		for (int n=0; n<THING_COUNT;n++)
		{
			System.out.println(thingArray[n]);
		}
		
		System.out.println();
		
		//Creatures eating bat
		System.out.println("Creatures Eating a Bat:\n");
		Bat batfood = new Bat("Lenny");
		for (int m=0; m<CREATURE_COUNT; m++)
		{
			creatureArray[m].eat(batfood);
		}
		
		//Creatures last meal
		System.out.println();
		System.out.println("Check of the Last Meal: \n");
		for (int m=0; m<CREATURE_COUNT; m++)
		{
			creatureArray[m].whatDidYouEat();
		}
		
		//Creatures eating a thing
		System.out.println();
		System.out.println("Creatures Eating a Bat:\n");
		Thing junk = new Thing("Junk");
		for (int m=0; m<CREATURE_COUNT; m++)
		{
			creatureArray[m].eat(junk);
		}
		
		//What creatures last ate 
		System.out.println();
		System.out.println("Check of the Last Meal: \n");
		for (int m=0; m<CREATURE_COUNT; m++)
		{
			creatureArray[m].whatDidYouEat();
		}
			
	}
	
}
