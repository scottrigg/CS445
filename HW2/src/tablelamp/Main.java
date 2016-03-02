package tablelamp;
import button.Button;
import lightbulb.Lightbulb;

public class Main {

	public static void main(String[] args)
	{
		Lightbulb bulb = new Lightbulb();
		Button bttn= new Button(bulb);
		bttn.switchOn();
		bttn.switchOff();
		
		
	}
	
}
