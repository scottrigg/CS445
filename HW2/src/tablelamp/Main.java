/**
 * @author Scott Rigg
 */
package tablelamp;
import button.Button;
import button.PushdownButton;
import lightbulb.Lightbulb;

public class Main {

	public static void main(String[] args)
	{
		Lightbulb bulb = new Lightbulb();
		Button bttn= new Button(bulb);
		bttn.switchOn();
		bttn.switchOff();
		
		PushdownButton pdb = new PushdownButton(bulb);
		pdb.PushButton();
		pdb.PushButton();
	}
	
}
